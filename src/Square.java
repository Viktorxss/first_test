class Square
{
    int width;
    int length;
    Square()
    {
        width = 1;
        length = 1;

    }
    Square(int a)
    {
        width = a ;
        length = 1;
    }
    Square (int a, int b)
    {
        width = a;
        length = b;
    }// 三个构造函数
    public String toString()
    {//继承的来自object的方法
        System.out.println("矩形的面积:"+width*length);
        return "矩形的面积:"+width*length;
    }
}

