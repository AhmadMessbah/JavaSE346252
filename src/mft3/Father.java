package mft3;

public class Father extends GrandFather{
    @Override
    public void job() {
        super.job();
        System.out.println("Father");
    }
}
