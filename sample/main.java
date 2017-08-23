import android.util.Log;

import src.BankEnum;

/**
 * Created by badrnezhad on 8/23/2017.
 */

public class test {
    public void main() {
        try {
            String shebaNumber = "IR000100000000203456078900";
            String cardNumber = "0100000010001";
            String shebaBankName = BankEnum.getBankNameByBankEnum(BankEnum.getBankEnumByShebaNumber(shebaNumber));
            String cardBankName = BankEnum.getBankNameByBankEnum(BankEnum.getBankEnumByCardNumber(cardNumber));
            Log.i("Sheba", shebaNumber + " : " + shebaBankName);
            Log.i("Card", cardNumber + " : " + cardBankName);
        } catch (Exception ex) {
            Log.d("Bank Name", ex.getMessage());
        }
    }
}
