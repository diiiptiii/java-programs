
class plate{
    int l;
    int w;
    plate(int length,int width){
        l=length;
        w=width;
    }
}
class box{
    int h;
    box(int length,int width,int height){
        super(length,width);
            h=height;
        }

    }

class woodbox extends box{
    int t;
    woodbox(int length,int width,int height,int thick){
        super(length,width,height);{
            t=thick;
        }
    }
}
class main{
    public static void main(string args[]){
        woodbox wb = new woodbox();
        System.out.println(+wb.length);
        System.out.println(+wb.width);
        System.out.println(+wb.height);
        System.out.println(+wb.thick);
    }
    }