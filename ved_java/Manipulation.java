class string{
    public static void main(String args[]) {
        String s="Hello";
        String s1="XYZ";
        String s2="Hello";
        //length
        System.out.println(s.length());
        //concat
        System.out.println(s.concat(s1));
        //charAt
        System.out.println(s.charAt(0));
        //equals
        System.out.println(s.equals(s2));
        //ignorecase
        System.out.println(s.equalsIgnoreCase(s2));
        //indexof
        System.out.println(s.indexOf("l"));
        //lastindexof
        System.out.println(s.lastIndexOf("l"));
        //string buffer
        StringBuffer sb=new StringBuffer("Hello");
        sb.append("Ved");
        System.out.println(sb);
        sb.insert(0,"V");
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(0,1,"V");
        System.out.println(sb);
        sb.capacity();
        System.out.println(sb);

}
}   