public class ConversaoTipoPrimitivo{

    public static void main(String[] args){
        long x = 9300000035L;
        //casting (não automático)
        int y = (int) x;
        System.out.println(y);

        y = 102344;
        //casting (automático)
        x = y;
        System.out.println(x);

        double a = 20.5;
        //casting (não automático)
        float b = (float) a;
        System.out.println(b);

        float c = 934.5f;
        //casting (automático)
        float d = c;
        System.out.println(d);

        double largura = 100.37;
        int tamanho = (int) largura;
        System.out.println(tamanho);

    }
}