import java.util.*;

public class MaxCurrency {
    public static double maxAmount(String initialCurrency, List<List<String>> pairs1, double[] rates1, List<List<String>> pairs2, double[] rates2) {
        Map<String, Double> d1 = new HashMap<>();
        Map<String, Double> d2 = new HashMap<>();

        // Start with 1.0 of the initial currency
        d1.put(initialCurrency, 1.0);

        // Process Day 1 conversions using propagation
        propagateRates(d1, pairs1, rates1);

        // Initialize Day 2 map with values from Day 1
        for (String currency : d1.keySet()) {
            d2.put(currency, d1.get(currency));
        }

        // Process Day 2 conversions using propagation
        propagateRates(d2, pairs2, rates2);

        // Return the maximum amount of the initial currency
        return d2.getOrDefault(initialCurrency, 0.0);
    }

    private static void propagateRates(Map<String, Double> rates, List<List<String>> pairs, double[] conversionRates) {
        // Repeat for the number of currencies to ensure propagation
        for (int k = 0; k < pairs.size(); k++) { // Ensure maximum propagation
            for (int i = 0; i < pairs.size(); i++) {
                String left = pairs.get(i).get(0);
                String right = pairs.get(i).get(1);
                double rate = conversionRates[i];

                rates.putIfAbsent(left, 0.0);
                rates.putIfAbsent(right, 0.0);

                // Update maximum possible conversions
                if (rates.get(left) > 0.0) {
                    rates.put(right, Math.max(rates.get(right), rates.get(left) * rate));
                }
                if (rates.get(right) > 0.0) {
                    rates.put(left, Math.max(rates.get(left), rates.get(right) / rate));
                }
            }
        }
    }

    public static void main(String[] args) {
        String initialCurrency = "ACB";
        List<List<String>> pairs1 = Arrays.asList(Arrays.asList("SFE", "Z"), Arrays.asList("ACB", "SFE"));
        double[] rates1 = {9.1, 2.4};
        List<List<String>> pairs2 = Arrays.asList(Arrays.asList("SFE", "Z"), Arrays.asList("ACB", "SFE"));
        double[] rates2 = {2.8, 5.0};

        System.out.println(maxAmount(initialCurrency, pairs1, rates1, pairs2, rates2));

        String initialCurrency1 = "EUR";
        List<List<String>> pairs1_1 = Arrays.asList(Arrays.asList("EUR", "USD"), Arrays.asList("USD", "JPY"));
        double[] rates1_1 = {2.0, 3.0};
        List<List<String>> pairs2_1 = Arrays.asList(Arrays.asList("JPY", "USD"), Arrays.asList("USD", "CHF"), Arrays.asList("CHF", "EUR"));
        double[] rates2_1 = {4.0, 5.0, 6.0};
        System.out.println(maxAmount(initialCurrency1, pairs1_1, rates1_1, pairs2_1, rates2_1)); // Output: 720.0
        
        // Example 2
        String initialCurrency2 = "NGN";
        List<List<String>> pairs1_2 = Arrays.asList(Arrays.asList("NGN", "EUR"));
        double[] rates1_2 = {9.0};
        List<List<String>> pairs2_2 = Arrays.asList(Arrays.asList("NGN", "EUR"));
        double[] rates2_2 = {6.0};
        System.out.println(maxAmount(initialCurrency2, pairs1_2, rates1_2, pairs2_2, rates2_2)); // Output: 1.5
        
        // Example 3
        String initialCurrency3 = "USD";
        List<List<String>> pairs1_3 = Arrays.asList(Arrays.asList("USD", "EUR"));
        double[] rates1_3 = {1.0};
        List<List<String>> pairs2_3 = Arrays.asList(Arrays.asList("EUR", "JPY"));
        double[] rates2_3 = {10.0};
        System.out.println(maxAmount(initialCurrency3, pairs1_3, rates1_3, pairs2_3, rates2_3)); // Output: 1.0
    }
    }

