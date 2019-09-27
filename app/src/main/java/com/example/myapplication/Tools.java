package com.example.myapplication;

import android.util.Log;

public class Tools {
    private long ans;
    private char ch,operator;
    private long tmp1,tmp2;

    private void op_ev(char operator){
        if(operator=='+'){
            tmp1 += tmp2;
        }
        else if(operator=='-'){
            tmp1-=tmp2;
        }
        else if(operator=='*'){
            tmp1 *= tmp2;
        }
        else if (operator=='/'){
            tmp1 /= tmp2;
        }
    }

    public String evaluation(String expression){
        tmp1=0;
        tmp2=0;


        for(int i = 0; i<expression.length();i++){
            ch = expression.charAt(i);
            Log.i("VUl", Long.toString(tmp2));
            Log.i("VUl", ""+ch);
            if(ch<'0'||ch>'9') {
                if(tmp1 == 0) {
                    tmp1 = tmp2;
                    operator = ch;
                    tmp2=0;
                }
                else{
                    op_ev(operator);
                    operator = ch;
                    tmp2 = 0;
                }
            }
            else{
                tmp2 = tmp2*10 + (int)ch - '0';
            }
            if(i+1==expression.length()){
                op_ev(operator);
                ans = tmp1;
            }
        }
        return Long.toString(ans);
    }

    public int add_tes(int a ,int b){
        return a+b;
    }
}