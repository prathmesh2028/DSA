package StringInJava;

public class PanagramChecking {
    public static void main(String[] args) {
        String str = "Thequickbrownfoxjumpsoverthelazydog";
        System.out.println(panagram(str));
    }
    public static boolean panagram(String s){
        int n = s.length();
        if(n < 26) return false;
        boolean[] visited = new boolean[26];
        for(int i = 0 ; i < n ; i++){
            char x = s.charAt(i);
            if( x >= 'a' && x <= 'z'){
                visited[x - 'a'] = true;
            }
            else if(x >= 'A' && x <= 'Z'){
                visited[x - 'A'] = true;
            }
        }
        for(int i = 0 ; i < visited.length ; i++){
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }
}
