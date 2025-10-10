package meituan2025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class three {
    private static final long MOD = 998244353;

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = 2 * n;

        // 如果 n=0 或 m<2, 则方差为0 (m=0 或 1 时无循环或仅一个点)
        if (m < 2) {
            System.out.println(0);
            return;
        }

        long varianceMod = 0;
        // 计算方差: sum_{k=2}^{m} (k-1) * inv(k)^2 mod MOD
        for (int k = 2; k <= m; k++) {
            // 计算 k 在模 MOD 下的逆元: invK = k^(MOD-2) mod MOD
            long invK = modPow(k, MOD - 2, MOD);
            // inv(k^2) = (invK)^2 mod MOD
            long invK2 = (invK * invK) % MOD;
            // 项: (k-1) * invK2 mod MOD
            long term = ((long) (k - 1) * invK2) % MOD;
            varianceMod = (varianceMod + term) % MOD;
        }
        // 确保非负
        varianceMod = (varianceMod + MOD) % MOD;
        System.out.println(varianceMod);
    }

    // 快速幂计算: base^exponent mod modulus
    private static long modPow(int base, long exponent, long modulus) {
        long result = 1;
        long baseLong = base % modulus;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * baseLong) % modulus;
            }
            baseLong = (baseLong * baseLong) % modulus;
            exponent >>= 1;
        }
        return result;
    }
}
