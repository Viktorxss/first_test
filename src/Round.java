class Round
{
    int radius;//半径
    Round()
    {
        radius = 1;//半径
    }
    Round(int i)
    {
        radius = i;
    }
    public String toString()
    {//继承的来自object的方法
        System.out.println("圆的面积:"+radius*radius*Math.PI);
        System.out.println("圆的周长:"+radius*2*Math.PI);
        return "圆的面积"+radius*radius*Math.PI+" 圆的周长:"+radius*2*Math.PI;
    }
}