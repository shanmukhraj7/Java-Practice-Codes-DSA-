public class ForEach {
    public static void main(String[] args) {
        String[] myArr = new String[]
        {
            "Ram", "Shyam", "Sita", "Geeta", "Sheela", "Maala"
        };
        FoEach(myArr);
    }

    public static void FoEach(String[] arr)
    {
        for(String name: arr)
        {
            System.out.println(name);

        }
    }
}
