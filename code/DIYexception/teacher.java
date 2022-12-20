package DIYexception;

public class teacher {
    public void checkScore(int score) throws scorexception{
        if(score<0 ||score > 100){
            throw new scorexception("您给出的分数有误");
        }else{
            System.out.println("分数正常");
        }
    }
}
