package kr.pet.mvc;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner = new Scanner(System.in);

    // 전화번호를 입력받는 화면
    public String getPhoneNumber(){
        System.out.println("전화번호를 입력하세요.");
        return scanner.nextLine();
    }

    // 신규 고객정보 입력 화면
    public Customer getCustomerInfo(){
        System.out.println("신규 고객 정보를 입력하세요.");
        System.out.print("전화번호 : ");
        String phoneNumber = scanner.nextLine();
        System.out.print("소유주 이름 : ");
        String ownerName = scanner.nextLine();
        System.out.print("동물 이름 : ");
        String petName = scanner.nextLine();
        System.out.print("주소 : ");
        String address = scanner.nextLine();
        System.out.print("종류 : ");
        String species = scanner.nextLine();
        System.out.print("출생년도(yyyy) : ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // 개행문자 제거
        return new Customer(phoneNumber,ownerName,petName,address,species,birthYear);
    }

    // 진료 기록을 입력 받는 화면
    public MedicalRecord getMedicalRecordInfo(){
        System.out.print("진료일을 입력하세요 : ");
        String date = scanner.nextLine();

        System.out.println("진료 내용을 입력하세요 : ");
        String content = scanner.nextLine();

        return new MedicalRecord(null,date,content);
    }

    // 진료기록 조회하여 출력
    public void printMedicalRecordInfo(Customer customer){
        List<MedicalRecord> records = customer.getMedicalRecords();
        System.out.println("[" + customer.getPetName() + "]의 진료기록");
        for (MedicalRecord record: records) {
            System.out.println(" - 진료일 : " + record.getDate());
            System.out.println("   진료내용 : " + record.getContent());
            System.out.println("   소유주 이름 : " + customer.getOwnerName());
            System.out.println("   동물 이름 : " + customer.getPetName());
            System.out.println("   주소 : " + customer.getAddress());
            System.out.println("   종류 : " + customer.getSpecies());
            System.out.println("   출생년도 : " + customer.getBirthYear());
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
