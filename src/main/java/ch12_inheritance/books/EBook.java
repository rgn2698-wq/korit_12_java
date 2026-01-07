package ch12_inheritance.books;

public class EBook extends Book{
    // field 선언
    private double fileSize;
    private String format;

    // AllArgsConstructor 생성
    public EBook(String title, String author, String format, double fileSize) {
        super(title, author);
        this.format = format;
        this.fileSize = fileSize;
    }

    // getter / setter 생성
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    // Override 설정
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("파일 크기 :" + fileSize + "MB");
        System.out.println("파일 형식 :" + format);
    }

}
