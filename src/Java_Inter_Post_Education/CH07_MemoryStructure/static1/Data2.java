package Java_Inter_Post_Education.CH07_MemoryStructure.static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) {
        this.name = name;
        counter.count++;
    }
}
