public class Demo {
    public static void main(String[] args) {
        String[] a={"Anura","Ghanasaara Thero","Sam", "Maithree","Mahinda","Ranil", "Sajith"};

        String key="Sam";
        int index=SequentialSearch.search(key, a);
        System.out.println(key+" is in "+index+" position.");

        key="John";
        index=SequentialSearch.search(key, a);
        System.out.println(key+" is in "+index+" position.");
    }
}