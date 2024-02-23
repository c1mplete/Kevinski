package NetCalculator;

import java.util.ArrayList;

public class BinaryCalculator {
//    int bintoDec(String binNum) {
//        int decNum = 0;
//        int power = 0;
//        for (int i = binNum.length() - 1; i >= 0; i--) {
//            if (binNum.charAt(i) == '1') {
//                decNum += Math.pow(2, power);
//            }
//            power++;
//        }
//        return decNum;
//    }

    int bintoDec(String binNum){
        ArrayList<Integer> binList = new ArrayList<>();
        for(int i = 0; i < binNum.length(); i++){
            binList.add(Character.getNumericValue(binNum.charAt(i)));
        }
        int decNum = 0;
        int power = 0;
        for (int i = binList.size() - 1; i >= 0; i--) {
            if (binNum.charAt(i) == '1') {
                decNum += Math.pow(2, power);
            }
            power++;
        }
        return decNum;
    }

    String dectoBin(int decNum) {
        String binNum = "";
        while (decNum > 0) {
            binNum = decNum % 2 + binNum;
            decNum /= 2;
        }
        return binNum;
    }

    String addition(String firstBin, String secondBin){
        int carry = 0;
        String sum = "";
        ArrayList<Integer> binList1 = new ArrayList<>();
        for(int i = 0; i < firstBin.length(); i++){
            binList1.add(Character.getNumericValue(firstBin.charAt(i)));
        }
        ArrayList<Integer> binList2 = new ArrayList<>();
        for(int i = 0; i < secondBin.length(); i++){
            binList2.add(Character.getNumericValue(secondBin.charAt(i)));
        }
        //1 0 0 1 -- firstBin
        //0 1 0 1 -- secondBin
        if(binList1.size() < binList2.size()){
            int biggerList = 0;
            biggerList += binList2.size();
            biggerList -= binList1.size();
            for(int i = 0; biggerList >= i; i++){
                binList1.add(0, 0);
            }
        }else if(binList2.size() < binList1.size()){
            int biggerList = 0;
            biggerList += binList1.size();
            biggerList -= binList2.size();
            for(int i = 0; biggerList >= i; i++){
                binList2.add(0, 0);
            }
        }

        for(int i = 0; i < binList2.size(); i++){
            if(binList1.get(i) == 0 && binList2.get(i) == 0){
                if(carry == 1){
                    sum += "1";
                    carry = 0;
                }
            sum += "0";
        }else if(binList1.get(i) == 1 && binList2.get(i) == 0 || binList1.get(i) == 0 && binList2.get(i) == 1){
            sum += "1";
            }else{
                sum += "0";
                carry = 1;
            }
        }

        return sum;
    }

    String ipAddressCalculator(String ipAdresse) {
        String tmpIP = "";
        String finishedIP = "";
        String tmp;
        String[] ip = ipAdresse.split("\\.");
        for (int i = 0; i < ip.length; i++) {
            tmp = ip[i];
            if (i != ip.length - 1) {
                tmpIP += dectoBin(Integer.parseInt(tmp)) + ".";
            } else {
                tmpIP += dectoBin(Integer.parseInt(tmp));
            }
        }
        if(tmpIP.length() < 8){
            for(int k = 0; k <= tmpIP.length(); k++){
                finishedIP += 0;
            }

            finishedIP += tmpIP;

        }
        return finishedIP;
    }

}

