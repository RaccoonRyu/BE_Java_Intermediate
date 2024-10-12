package CH12.InputOutput;

import java.io.*;

public class InputOutput2 {
    public static void main(String[] args) throws IOException {
        // 입출력 2
        // 파일 입/출력

        // 1. 파일 쓰기
        // 1-1. FileWriter
        FileWriter fw = new FileWriter("./fwmemo.txt"); // 현재 폴더에 fwmemo.txt 파일 생성
        String memo = "헤드 라인\n";
        fw.write(memo);
        memo = "1월 1일 날씨 맑음\n";
        fw.write(memo); // write() : String data를 파일에 입력
        fw.close(); // 파일 쓰기가 완료되면 항상 close() 사용하여 닫아줘야 함.

        // 1-2. PrintWriter
        PrintWriter pw = new PrintWriter("./pwmemo.txt"); // 현재 폴더에 pwmemo.txt 파일 생성
        memo = "헤드 라인";
        pw.println(memo); // println() : PrintWriter는 data에 개행까지 포함하여 입력해주므로, 입력할 데이터에 \n 작성이 불필요
        memo = "1월 1일 날씨 맑음";
        pw.println(memo);
        pw.close();

        // 1-3. 파일 이어 쓰기
        // FW 이용
        FileWriter fw2 = new FileWriter("./fwmemo.txt", true); // append 옵션 : 파일명에 해당하는 파일에 내용 이어씀을 의미
        memo = "1월 2일 날씨 완전 맑음\n";
        fw2.write(memo);
        fw2.close();

        // PW 이용
        PrintWriter pw2 = new PrintWriter(new FileWriter("./pwmemo.txt", true)); // 매개변수 안에다가 FW를 만들어서 넣어줘야 함
        memo = "1월 3일 날씨 또 맑음!";
        pw2.println(memo);
        pw2.close();


        // 2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./fwmemo.txt")); // BufferedReader 객체 생성 시 매개변수에 FileReader 생성하여 넣어줌

        // 텍스트 파일의 여러 줄을 전부 읽는 반복문
        while (true) {
            String line = br.readLine(); // 파일로부터 데이터를 한 줄씩 읽음

            if (line == null) break; // 읽어온 라인에 데이터가 없는 경우 반복문 탈출
            System.out.println(line);
        }
        br.close();

        // 참고 : 단어 찾기/바꾸기
        // 단어 찾기 : "문자열".replace("찾을 단어", "바꿀 단어");
    }
}
