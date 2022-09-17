package Homework4;
@GetMetaData
public class UserMeta {
    @GetMetaData
    private String name;
    private Integer count;

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    @GetMetaData
    public String getSuperName(String prefix) throws InterruptedException {
        return prefix + " " + name;
    }
}
