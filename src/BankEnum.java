import java.math.BigInteger;

/**
 * Created by badrnezhad on 8/23/2017.
 */

public enum BankEnum {

    //region enums
    None,
    Na,//نا مشخص
    SaderatImprove,//بانک توسعه صادرات ایران
    Entrepreneur,//بانک کارآفرین
    Sepah,//بانک سپه
    RefahWorkers,//بانک رفاه کارگران
    Saderat,//بانک صادرات ایران
    Agricultural,//بانک کشاورزی
    Melli,//بانک ملّی
    Mellat,//بانک ملّت
    Saman,//بانک سامان
    Parsian,//بانک پارسیان
    Tejarat,//بانک تجارت
    EgtesadNovin,//بانک اقتصاد نوین
    PostBank,//پست بانک ایران
    Industry,//بانک صنعت و معدن
    Maskan,//بانک مسکن
    ImproveCredential,//موسسه اعتباری توسعه
    Central,//بانک مرکزی
    Pasrgad,//بانک پاسارگاد
    Capital,//بانک سرمایه
    City,//بانک شهر
    CooperationImprove,//بانک توسعه تعاون
    Dey,//بانک دی
    Travel,//بانک گردشگری
    IranZamin,//بانک ایران زمین
    Kosar,//موسسه اعتباری کوثر
    MeherIran,//بانک  قرض الحسنه مهر ایران
    Ansar,//بانک انصار
    Tat,//بانک تات
    Hekmat,//بانک حکمت ایرانیان
    Sina,//بانک سینا
    MehrEghtesad,//بانک مهر اقتصاد
    Ghavamin,//بانک قوامین
    Ayande,//بانک آینده
    Resalat;//بانک رسالت
    //endregion

    //region methods

    public static BankEnum getBankEnumByCardNumber(String cardNumber) {
        try {
            cardNumber = cardNumber.replace("-", "");

            if (cardNumber.length() != 16)
                return Na;

            String cardFormat = cardNumber.substring(0, 6);

            return getBankEnumByCardFormat(cardFormat);
        } catch (Exception ex) {
            ThisApp.logException(ex);
            return Na;
        }
    }

    public static BankEnum getBankEnumByShebaNumber(String shebaNumber) {
        try {
            shebaNumber = shebaNumber.replace("-", "");

            if (!isValidSheba(shebaNumber))
                return Na;


            String shebaFormat = shebaNumber.substring(4, 7);

            return getBankEnumByShebaFormat(shebaFormat);

        } catch (Exception ex) {
            ThisApp.logException(ex);
            return Na;
        }
    }

    public static String getBankNameByBankEnum(BankEnum bankEnum){
        try {
            switch (bankEnum) {
                case None:
                    return "نا مشخص";
                case Na:
                    return "نا مشخص";
                case SaderatImprove:
                    return "بانک توسعه صادرات ایران";
                case Entrepreneur:
                    return "بانک کارآفرین";
                case Sepah:
                    return "بانک سپه";
                case RefahWorkers:
                    return "بانک رفاه کارگران";
                case Saderat:
                    return "بانک صادرات ایران";
                case Agricultural:
                    return "بانک کشاورزی";
                case Melli:
                    return "بانک ملّی";
                case Mellat:
                    return "بانک ملّت";
                case Saman:
                    return "بانک سامان";
                case Parsian:
                    return "بانک پارسیان";
                case Tejarat:
                    return "بانک تجارت";
                case EgtesadNovin:
                    return "بانک اقتصاد نوین";
                case PostBank:
                    return "پست بانک ایران";
                case Industry:
                    return "بانک صنعت و معدن";
                case Maskan:
                    return "بانک مسکن";
                case ImproveCredential:
                    return "موسسه اعتباری توسعه";
                case Central:
                    return "بانک مرکزی";
                case Pasrgad:
                    return "بانک پاسارگاد";
                case Capital:
                    return "بانک سرمایه";
                case City:
                    return "بانک شهر";
                case CooperationImprove:
                    return "بانک توسعه تعاون";
                case Dey:
                    return "بانک دی";
                case Travel:
                    return "بانک گردشگری";
                case IranZamin:
                    return "بانک ایران زمین";
                case Kosar:
                    return "موسسه اعتباری کوثر";
                case MeherIran:
                    return "بانک  قرض الحسنه مهر ایران";
                case Ansar:
                    return "بانک انصار";
                case Tat:
                    return "بانک تات";
                case Hekmat:
                    return "بانک حکمت ایرانیان";
                case Sina:
                    return "بانک سینا";
                case MehrEghtesad:
                    return "بانک مهر اقتصاد";
                case Ghavamin:
                    return "بانک قوامین";
                case Ayande:
                    return "بانک آینده";
                case Resalat:
                    return "بانک رسالت";
                default:
                    return "";
            }
        }
        catch (Exception ex){
            ThisApp.logException(ex);
            return "";
        }
    }

    //endregion

    //region helper methods

    public static String[] getCardFormat(BankEnum bankEnum) {
        try {
            switch (bankEnum) {
                case None:
                    return new String[]{"0"};
                case Na:
                    return new String[]{"0"};
                case SaderatImprove:
                    return new String[]{"207177", "627648"};
                case Entrepreneur:
                    return new String[]{"603770", "639217"};
                case Sepah:
                    return new String[]{"589210"};
                case RefahWorkers:
                    return new String[]{"589463"};
                case Saderat:
                    return new String[]{"603769"};
                case Agricultural:
                    return new String[]{"603770", "639217"};
                case Melli:
                    return new String[]{"603799"};
                case Mellat:
                    return new String[]{"610433", "991975"};
                case Saman:
                    return new String[]{"621986"};
                case Parsian:
                    return new String[]{"622106", "627884", "639194"};
                case Tejarat:
                    return new String[]{"627353"};
                case EgtesadNovin:
                    return new String[]{"627412"};
                case PostBank:
                    return new String[]{"627760"};
                case Industry:
                    return new String[]{"627961"};
                case Maskan:
                    return new String[]{"628023"};
                case ImproveCredential:
                    return new String[]{"628157"};
                case Central:
                    return new String[]{"636795"};
                case Pasrgad:
                    return new String[]{"502229", "639347"};
                case Capital:
                    return new String[]{"639607", "504706"};
                case City:
                    return new String[]{"502806"};
                case CooperationImprove:
                    return new String[]{"502908"};
                case Dey:
                    return new String[]{"502938"};
                case Travel:
                    return new String[]{"505416"};
                case IranZamin:
                    return new String[]{"505785"};
                case Kosar:
                    return new String[]{"505801"};
                case MeherIran:
                    return new String[]{"606373"};
                case Ansar:
                    return new String[]{"627381"};
                case Tat:
                    return new String[]{"636214"};
                case Hekmat:
                    return new String[]{"636949"};
                case Sina:
                    return new String[]{"639346"};
                case MehrEghtesad:
                    return new String[]{"639370"};
                case Ghavamin:
                    return new String[]{"639599"};
                case Ayande:
                    return new String[]{""};
                case Resalat:
                    return new String[]{""};
                default:
                    return new String[]{"0"};
            }
        } catch (Exception ex) {
            ThisApp.logException(ex);
            return new String[]{"0"};
        }
    }

    public static String[] getShebaFormat(BankEnum bankEnum) {
        try {
            switch (bankEnum) {
                case None:
                    return new String[]{"0"};
                case Na:
                    return new String[]{"0"};
                case SaderatImprove:
                    return new String[]{"020"};
                case Entrepreneur:
                    return new String[]{"053"};
                case Sepah:
                    return new String[]{"015"};
                case RefahWorkers:
                    return new String[]{"013"};
                case Saderat:
                    return new String[]{"019"};
                case Agricultural:
                    return new String[]{"016"};
                case Melli:
                    return new String[]{"017"};
                case Mellat:
                    return new String[]{"012"};
                case Saman:
                    return new String[]{"056"};
                case Parsian:
                    return new String[]{"054"};
                case Tejarat:
                    return new String[]{"018"};
                case EgtesadNovin:
                    return new String[]{"055"};
                case PostBank:
                    return new String[]{"021"};
                case Industry:
                    return new String[]{"011"};
                case Maskan:
                    return new String[]{"014"};
                case ImproveCredential:
                    return new String[]{"051"};
                case Central:
                    return new String[]{"010"};
                case Pasrgad:
                    return new String[]{"057"};
                case Capital:
                    return new String[]{"058"};
                case City:
                    return new String[]{"061"};
                case CooperationImprove:
                    return new String[]{"022"};
                case Dey:
                    return new String[]{"066"};
                case Travel:
                    return new String[]{"064"};
                case IranZamin:
                    return new String[]{"069"};
                case Kosar:
                    return new String[]{""};
                case MeherIran:
                    return new String[]{"060"};
                case Ansar:
                    return new String[]{"063"};
                case Tat:
                    return new String[]{""};
                case Hekmat:
                    return new String[]{"065"};
                case Sina:
                    return new String[]{"059"};
                case MehrEghtesad:
                    return new String[]{""};
                case Ghavamin:
                    return new String[]{""};
                case Ayande:
                    return new String[]{"062"};
                case Resalat:
                    return new String[]{"070"};
                default:
                    return new String[]{"0"};
            }
        } catch (Exception ex) {
            ThisApp.logException(ex);
            return new String[]{"0"};
        }
    }

    public static BankEnum getBankEnumByCardFormat(String cardFormat) {
        try {
            switch (cardFormat) {
                case "0":
                    return Na;
                case "207177":
                case "627648":
                    return SaderatImprove;
                case "502910":
                case "627488":
                    return Entrepreneur;
                case "589210":
                    return Sepah;
                case "589463":
                    return RefahWorkers;
                case "603769":
                    return Saderat;
                case "603770":
                case "639217":
                    return Agricultural;
                case "603799":
                    return Melli;
                case "610433":
                case "991975":
                    return Mellat;
                case "621986":
                    return Saman;
                case "622106":
                case "627884":
                case "639194":
                    return Parsian;
                case "627353":
                    return Tejarat;
                case "627412":
                    return EgtesadNovin;
                case "627760":
                    return PostBank;
                case "627961":
                    return Industry;
                case "628023":
                    return Maskan;
                case "628157":
                    return ImproveCredential;
                case "636795":
                    return Central;
                case "502229":
                case "639347":
                    return Pasrgad;
                case "639607":
                    return Capital;
                case "502806":
                case "504706":
                    return City;
                case "502908":
                    return CooperationImprove;
                case "502938":
                    return Dey;
                case "505416":
                    return Travel;
                case "505785":
                    return IranZamin;
                case "505801":
                    return Kosar;
                case "606373":
                    return MeherIran;
                case "627381":
                    return Ansar;
                case "636214":
                    return Tat;
                case "636949":
                    return Hekmat;
                case "639346":
                    return Sina;
                case "639370":
                    return MehrEghtesad;
                case "639599":
                    return Ghavamin;
//                case "":
//                    return Ayande;
//                case "":
//                    return Resalat;
                default:
                    return Na;
            }
        } catch (Exception ex) {
            ThisApp.logException(ex);
            return Na;
        }
    }

    public static BankEnum getBankEnumByShebaFormat(String cardFormat) {
        try {
            switch (cardFormat) {
                case "0":
                    return Na;
                case "020":
                    return SaderatImprove;
                case "053":
                    return Entrepreneur;
                case "015":
                    return Sepah;
                case "013":
                    return RefahWorkers;
                case "019":
                    return Saderat;
                case "016":
                    return Agricultural;
                case "017":
                    return Melli;
                case "012":
                    return Mellat;
                case "056":
                    return Saman;
                case "054":
                    return Parsian;
                case "018":
                    return Tejarat;
                case "055":
                    return EgtesadNovin;
                case "021":
                    return PostBank;
                case "011":
                    return Industry;
                case "014":
                    return Maskan;
                case "051":
                    return ImproveCredential;
                case "010":
                    return Central;
                case "057":
                    return Pasrgad;
                case "058":
                    return Capital;
                case "061":
                    return City;
                case "022":
                    return CooperationImprove;
                case "066":
                    return Dey;
                case "064":
                    return Travel;
                case "069":
                    return IranZamin;
//                case "":
//                    return Kosar;
                case "060":
                    return MeherIran;
                case "063":
                    return Ansar;
//                case "":
//                    return Tat;
                case "065":
                    return Hekmat;
                case "059":
                    return Sina;
//                case "":
//                    return MehrEghtesad;
//                case "":
//                    return Ghavamin;
                case "062":
                    return Ayande;
                case "070":
                    return Resalat;
                default:
                    return Na;
            }
        } catch (Exception ex) {
            ThisApp.logException(ex);
            return Na;
        }
    }

    public static boolean isValidSheba(String sheba) {

        try {
            sheba = sheba.toUpperCase();
            sheba = sheba.replace("A", "10");
            sheba = sheba.replace("B", "11");
            sheba = sheba.replace("C", "12");
            sheba = sheba.replace("D", "13");
            sheba = sheba.replace("E", "14");
            sheba = sheba.replace("F", "15");
            sheba = sheba.replace("G", "16");
            sheba = sheba.replace("H", "17");
            sheba = sheba.replace("I", "18");
            sheba = sheba.replace("J", "19");
            sheba = sheba.replace("K", "20");
            sheba = sheba.replace("L", "21");
            sheba = sheba.replace("M", "22");
            sheba = sheba.replace("N", "23");
            sheba = sheba.replace("O", "24");
            sheba = sheba.replace("P", "25");
            sheba = sheba.replace("Q", "26");
            sheba = sheba.replace("R", "27");
            sheba = sheba.replace("S", "28");
            sheba = sheba.replace("T", "29");
            sheba = sheba.replace("U", "30");
            sheba = sheba.replace("V", "31");
            sheba = sheba.replace("W", "32");
            sheba = sheba.replace("X", "33");
            sheba = sheba.replace("Y", "34");
            sheba = sheba.replace("Z", "35");
            String res = sheba.substring(0, 6);
            sheba = sheba + res;
            String finalSheba = sheba.substring(6, sheba.length());
            BigInteger value = new BigInteger(finalSheba);
            BigInteger nineSeven = new BigInteger("97");
            BigInteger remain = value.remainder(nineSeven);


            if (remain.compareTo(new BigInteger("1")) == 0)
                return true;
            return false;
        } catch (Exception ex) {
            ThisApp.logException(ex);
            return false;
        }
    }

    public static String splitSheba(String sheba) {
        try {
            String print = "";
            int div = 3;
            int index = 0;
            if (sheba.length() > 1 && sheba.substring(0, 2).toUpperCase() == "IR") {
                div = 1;
                index = 2;
                print += "IR-";
            }

            if (sheba.length() > 2) {
                for (int i = index; i < sheba.length(); i++) {
                    if (i % 4 == div) {
                        if (i == sheba.length() - 1)
                            print += sheba.toCharArray()[i];
                        else
                            print += (sheba.toCharArray()[i] + "-");
                    } else
                        print += sheba.toCharArray()[i];
                }
                return print;
            }
            return sheba;

        } catch (Exception ex) {
            ThisApp.logException(ex);
            return null;

        }
    }

    //endregion

}
