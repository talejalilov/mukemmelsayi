public class Main {
    public static void main(String[] args) {


        int sayac =0;
      for(int j = 2 ; j<100;j++){
          sayac++;
          for(int i=1;i<j;i++){

              if(j % i ==0){
                  sayac = sayac+i;
              }
          }
      }
    }
}
