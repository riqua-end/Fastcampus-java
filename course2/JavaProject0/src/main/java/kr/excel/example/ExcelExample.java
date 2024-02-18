package kr.excel.example;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelExample {
    public static void main(String[] args) {
        // example.xlsx 파일을 읽기 위해 FileInputStream을 생성한다.
        try {
            FileInputStream file = new FileInputStream(new File("example.xlsx"));

            // FileInputStream으로부터 Workbook 객체 생성
            Workbook workbook = WorkbookFactory.create(file);

            // Workbook으로부터 첫 번째 시트를 가져온다.
            Sheet sheet = workbook.getSheetAt(0);

            // 시트의 각 행(row)에 대해 반복한다.
            for (Row row : sheet) {
                // 행의 각 셀(cell)에 대해 반복한다.
                for (Cell cell : row) {
                    // 셀의 타입에 따라 다르게 처리한다.
                    switch (cell.getCellType()) {
                        case NUMERIC: // 숫자 타입인 경우
                            if (DateUtil.isCellDateFormatted(cell)) {
                                // 날짜 형식인 경우
                                Date dateValue = cell.getDateCellValue();
                                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String formattedDate = dateFormat.format(dateValue);
                                System.out.print(formattedDate + "\t");
                            } else {
                                // 숫자인 경우
                                double numericValue = cell.getNumericCellValue();
                                if (numericValue == Math.floor(numericValue)) {
                                    // 소수점 없는 경우 (정수)
                                    int intValue = (int) numericValue;
                                    System.out.print(intValue + "\t");
                                } else {
                                    // 소수점이 있는 경우
                                    System.out.print(numericValue + "\t");
                                }
                            }
                            break;
                        case STRING:
                            // 문자열 타입인 경우
                            String stringValue = cell.getStringCellValue();
                            System.out.print(stringValue + "\t");
                            break;
                        case BOOLEAN:
                            // boolean 타입인 경우
                            boolean booleanValue = cell.getBooleanCellValue();
                            System.out.print(booleanValue + "\t");
                            break;
                        case FORMULA:
                            // 수식 타입인 경우
                            String formulaValue = cell.getCellFormula();
                            System.out.print(formulaValue + "\t");
                            break;
                        case BLANK:
                            // 빈 셀인 경우
                            System.out.print("\t");
                            break;
                        default:
                            // 기타 타입인 경우
                            System.out.print("\t");
                            break;
                    }
                }
                // 행이 끝날 때마다 줄바꿈
                System.out.println();
            }
            // 파일 닫기
            file.close();
            System.out.println("엑셀에서 데이터 읽어오기 성공");
        } catch (IOException e) {
            // 예외 발생 시 스택 트레이스 출력
            e.printStackTrace();
        }
    }
}
