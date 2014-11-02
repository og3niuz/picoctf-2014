import java.math.BigInteger;

public class RSA {
    public static void main(String []args){
        BigInteger p = new BigInteger("12068007193924458934136437678747032125702047288192605563386647134926126290032925205587466786811951860570462107503408192389036293790565313661792631609456701");
        BigInteger q = new BigInteger("11290942893206290336467162060839444758991526481896862143525109986063294905531141292368885863941910700698869187227122590028398079775349558555477255622057419");
        BigInteger e = new BigInteger("65537");
        BigInteger c = new BigInteger("51935627829478461189099563098437558456954289973752038061332368035364779298997562059047272001745735894893013853883939635697283766893912948994706422956477537921723148859034516218148515993348118097276631538756795629109738609006053552602140623664842665052440933334606837472355741830280967530082282057888744933918");

        BigInteger n = p.multiply(q);
        System.out.println("n: " + n);
        BigInteger totient = p.subtract(new BigInteger("1")).multiply(q.subtract(new BigInteger("1")));
        BigInteger d = e.modInverse(totient);
        System.out.println("d: " + d.toString());
        BigInteger answer = c.modPow(d, n);
        System.out.println("message: " + answer.toString());
    }
}

