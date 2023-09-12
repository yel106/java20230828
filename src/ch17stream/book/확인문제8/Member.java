package ch17stream.book.확인문제8;

public class Member {
    private String name;
    private String job;

    //shift 누르고 선택하면 됨
    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
