package DIYexception;

public class teacher {
    public void checkScore(int score) throws scorexception{
        if(score<0 ||score > 100){
            throw new scorexception("�������ķ�������");
        }else{
            System.out.println("��������");
        }
    }
}
