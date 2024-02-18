package kr.excel.example;

import kr.excel.entity.MemberVO;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcelWriter {
    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 회원 정보를 담을 리스트 생성
        List<MemberVO> members = new ArrayList<>();

        // 무한 루프를 통해 사용자로부터 회원 정보를 입력받음
        while(true){
            // 이름 입력
            System.out.print("이름을 입력하세요.");
            String name = scanner.nextLine();

            // "quit"이 입력되면 루프를 종료
            if(name.equals("quit")){
                break;
            }

            // 나이 입력
            System.out.print("나이를 입력하세요.");
            int age = scanner.nextInt();
            scanner.nextLine(); // 개행문자 제거

            // 생년월일 입력
            System.out.print("생년월일을 입력하세요.");
            String birthdate = scanner.nextLine();

            // 전화번호 입력
            System.out.print("전화번호를 입력하세요.");
            String phone = scanner.nextLine();

            // 주소 입력
            System.out.print("주소를 입력하세요.");
            String address = scanner.nextLine();

            // 결혼 여부 입력
            System.out.println("결혼 여부를 입력하세요. ( true/false )");
            boolean isMarried = scanner.nextBoolean();
            scanner.nextLine(); // 개행문자 제거

            // 입력받은 정보를 MemberVO 객체로 생성하여 리스트에 추가
            MemberVO member = new MemberVO(name,age,birthdate,phone,address,isMarried);
            members.add(member);
        }

        // Scanner 객체 닫기
        scanner.close();

        try{
            // 엑셀 워크북 생성
            XSSFWorkbook workbook = new XSSFWorkbook();
            // 시트 생성
            Sheet sheet = workbook.createSheet("회원 정보");

            // 헤더 생성
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("이름");
            headerRow.createCell(1).setCellValue("나이");
            headerRow.createCell(2).setCellValue("생년월일");
            headerRow.createCell(3).setCellValue("전화번호");
            headerRow.createCell(4).setCellValue("주소");
            headerRow.createCell(5).setCellValue("결혼 여부");

            // 데이터 생성
            for (int i = 0; i < members.size(); i++) {
                MemberVO member = members.get(i);
                Row row = sheet.createRow(i + 1);
                row.createCell(0).setCellValue(member.getName());
                row.createCell(1).setCellValue(member.getAge());
                row.createCell(2).setCellValue(member.getBirthdate());
                row.createCell(3).setCellValue(member.getPhone());
                row.createCell(4).setCellValue(member.getAddress());
                row.createCell(5).setCellValue(member.isMarried());
            }

            // 엑셀 파일 저장
            String fileName = "members.xlsx";
            FileOutputStream outputStream = new FileOutputStream(new File(fileName));
            workbook.write(outputStream);
            workbook.close();
            System.out.println("엑셀 파일이 저장되었습니다 : " + fileName);
        }
        catch(IOException e){
            // 예외 발생 시 오류 메시지 출력
            System.out.println("엑셀 파일 저장 중 오류가 발생했습니다.");
            e.printStackTrace();
        }
    }
}
