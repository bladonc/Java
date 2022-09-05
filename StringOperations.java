public class StringOperations {
    public static void main(String[] args) {
        String myName = "Chris";
        System.out.println(myName);
        String myName1 = myName.replace('C', 'A');
        String myName2 = myName1.replace('s', 'Z');
        System.out.println(myName2);
        String url = "www.gatech.edu";
        System.out.println(url);
        String urlShort = "";
        urlShort = url.substring(4, 10);
        String urlNum = urlShort + 1331;
        System.out.println(urlNum);
    }
}