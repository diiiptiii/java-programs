public class bufferreader {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Initial Capacity: " + sb.capacity());
        sb.append(", how are you?");
        System.out.println("After append: " + sb.toString());
        sb.delete(6, 11);
        System.out.println("After delete: " + sb.toString());
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb.toString());
}
}
