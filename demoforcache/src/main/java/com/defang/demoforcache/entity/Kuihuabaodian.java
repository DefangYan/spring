package com.defang.demoforcache.entity;

import java.math.BigDecimal;

/**
 * @author defang.yan
 * @date 19-8-5 下午3:53
 */
public class Kuihuabaodian {
    //设贷款总额为A，银行月利率为β，总期数为m(个月)，月还款额设为X，则各个月所欠银行贷款为:
    //
    //第一个月A(1+β)-X
    //
    //第二个月(A(1+β)-X)(1+β)-X=A(1+β)2-X[1+(1+β)]
    //
    //第三个月((A(1+β)-X)(1+β)-X)(1+β)-X =A(1+β)3-X[1+(1+β)+(1+β)2] …
    //
    //由此可得第n个月后所欠银行贷款为 A(1+β)n –X[1+(1+β)+(1+β)2+…+(1+β)(n-1)]= A(1+β)n –X[(1+β)n - 1]/β
    //
    //由于还款总期数为m，也即第m月刚好还完银行所有贷款，
    //SimpleDateFormat
    //因此有 A(1+β)m –X[(1+β)m - 1]/β=0
    //
    //由此求得 X = Aβ(1+β)m/[(1+β)m - 1]
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("10000");
        BigDecimal bigDecimal1 = new BigDecimal("12");
        BigDecimal bigDecimal2 =BigDecimal.valueOf(0.035);
        BigDecimal divide = bigDecimal2.divide(bigDecimal1,5,BigDecimal.ROUND_HALF_DOWN);
        Double yearRate = new Double(0.036);
        float v = yearRate.floatValue() / 12;

        BigDecimal divide1 = bigDecimal.multiply(divide).multiply(new BigDecimal(Double.toString(Math.pow(1 + v, 12)))).divide(new BigDecimal(Double.toString(Math.pow(1 + v, 11))),5,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide1);
    }
}
