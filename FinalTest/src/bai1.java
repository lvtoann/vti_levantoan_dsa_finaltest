public class bai1 {

        public static void main(String[] args) {
            String s = "Abcs12321421@$$%#@#@#$%#$$$#@#@";
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    sb.append(c);
                }
            }

            String result = sb.toString();
            System.out.println(sb);
        }
    }

