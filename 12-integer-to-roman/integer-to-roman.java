class Solution {
    public String intToRoman(int n) {
        char[] c = new char[15];
        int i=0; 

        while(n >= 1000) {
            c[i++] = 'M';
            n -= 1000;
        }
        if(n >= 900){
            c[i++] = 'C';
            c[i++] = 'M';
            n -= 900;
        }
        if(n >= 500){
            c[i++] = 'D';
            n -= 500;
        }
        if(n >= 400){
            c[i++] = 'C';
            c[i++] = 'D';
            n -= 400;
        }

        while(n >= 100){
            c[i++] = 'C';
            n -= 100;
        }
        if(n >= 90){
            c[i++] = 'X';
            c[i++] = 'C';
            n -= 90;
        }
        if(n >= 50){
            c[i++] = 'L';
            n -= 50;
        }
        if(n >= 40){
            c[i++] = 'X';
            c[i++] = 'L';
            n -= 40;
        }
        
        while(n >= 10){
            c[i++] = 'X';
            n -= 10;
        }
        if(n >= 9){
            c[i++] = 'I';
            c[i++] = 'X';
            n -= 9;
        }
        if(n >= 5){
            c[i++] = 'V';
            n -= 5;
        }
        if(n >= 4){
            c[i++] = 'I';
            c[i++] = 'V';
            n -= 4;
        }

        while(n >= 1){
            c[i++] = 'I';
            n -= 1;
        }

        return new String(c , 0, i); 
    }
}