//naive approach using stack
// import java.util.Stack;

// public class backspacestringcompress {
//    public boolean backspaceCompare(String s, String t) {
//         char[] a1 = s.toCharArray();
//         char[] a2 = t.toCharArray();
//         Stack<Character> s1 = new Stack<>();
//         Stack<Character> s2 = new Stack<>();

//        for(int i = 0; i< a1.length;i++){
//         if(a1[i] == '#'){
//            if(!s1.isEmpty()){
//                 s1.pop();
//             }
//         }else{
//             s1.push(a1[i]);
//         }
//        }

//        for(int i = 0; i< a2.length;i++){
//         if(a2[i] == '#'){
//             if(!s2.isEmpty()){
//                 s2.pop();
//             }
//         }else{
//             s2.push(a2[i]);
//         }
//        }

//         String rs1 = s1.toString();
//         String rs2 = s2.toString();
//         if(rs1.equals(rs2)){
//             return true;
//         }else{
//         return false;
//        }
//     } 
// }
public class backspacestringcompress {
public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();  
    }
}