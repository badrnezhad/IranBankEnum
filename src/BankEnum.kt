package net.holosen.cardbankapp.enums

import java.math.BigInteger
import java.util.*


enum class BankEnum {
    //region enums
    None, Na,  //نا مشخص
    SaderatImprove,  //بانک توسعه صادرات ایران
    Entrepreneur,  //بانک کارآفرین
    Sepah,  //بانک سپه
    RefahWorkers,  //بانک رفاه کارگران
    Saderat,  //بانک صادرات ایران
    Agricultural,  //بانک کشاورزی
    Melli,  //بانک ملّی
    Mellat,  //بانک ملّت
    Saman,  //بانک سامان
    Parsian,  //بانک پارسیان
    Tejarat,  //بانک تجارت
    EgtesadNovin,  //بانک اقتصاد نوین
    PostBank,  //پست بانک ایران
    Industry,  //بانک صنعت و معدن
    Maskan,  //بانک مسکن
    ImproveCredential,  //موسسه اعتباری توسعه
    Central,  //بانک مرکزی
    Pasargad,  //بانک پاسارگاد
    Capital,  //بانک سرمایه
    City,  //بانک شهر
    CooperationImprove,  //بانک توسعه تعاون
    Dey,  //بانک دی
    Travel,  //بانک گردشگری
    IranZamin,  //بانک ایران زمین
    Kosar,  //موسسه اعتباری کوثر
    MeherIran,  //بانک  قرض الحسنه مهر ایران
    Ansar,  //بانک انصار
    Tat,  //بانک تات
    Hekmat,  //بانک حکمت ایرانیان
    Sina,  //بانک سینا
    MehrEghtesad,  //بانک مهر اقتصاد
    Ghavamin,  //بانک قوامین
    Ayande,  //بانک آینده
    Resalat;
    //بانک رسالت
    //endregion


    companion object {
        //region methods

        fun getBankEnumByCardNumber(cardNumber: String): BankEnum {
            var cardNumber = cardNumber
            return try {
                cardNumber = cardNumber.replace("-", "")
                if (cardNumber.length != 16) return Na
                val cardFormat = cardNumber.substring(0, 6)
                getBankEnumByCardFormat(cardFormat)
            } catch (e: Exception) {
                println(e.message)
                Na
            }
        }

        fun getBankEnumByShebaNumber(shebaNumber: String): BankEnum {
            var shebaNumber = shebaNumber
            return try {
                shebaNumber = shebaNumber.replace("-", "")
                if (!isValidSheba(shebaNumber)) return Na
                val shebaFormat = shebaNumber.substring(4, 7)
                getBankEnumByShebaFormat(shebaFormat)
            } catch (e: Exception) {
                println(e.message)
                Na
            }
        }

        fun getBankNameByBankEnum(bankEnum: BankEnum?): String {
            return try {
                when (bankEnum) {
                    None -> "نا مشخص"
                    Na -> "نا مشخص"
                    SaderatImprove -> "بانک توسعه صادرات ایران"
                    Entrepreneur -> "بانک کارآفرین"
                    Sepah -> "بانک سپه"
                    RefahWorkers -> "بانک رفاه کارگران"
                    Saderat -> "بانک صادرات ایران"
                    Agricultural -> "بانک کشاورزی"
                    Melli -> "بانک ملّی"
                    Mellat -> "بانک ملّت"
                    Saman -> "بانک سامان"
                    Parsian -> "بانک پارسیان"
                    Tejarat -> "بانک تجارت"
                    EgtesadNovin -> "بانک اقتصاد نوین"
                    PostBank -> "پست بانک ایران"
                    Industry -> "بانک صنعت و معدن"
                    Maskan -> "بانک مسکن"
                    ImproveCredential -> "موسسه اعتباری توسعه"
                    Central -> "بانک مرکزی"
                    Pasargad -> "بانک پاسارگاد"
                    Capital -> "بانک سرمایه"
                    City -> "بانک شهر"
                    CooperationImprove -> "بانک توسعه تعاون"
                    Dey -> "بانک دی"
                    Travel -> "بانک گردشگری"
                    IranZamin -> "بانک ایران زمین"
                    Kosar -> "موسسه اعتباری کوثر"
                    MeherIran -> "بانک  قرض الحسنه مهر ایران"
                    Ansar -> "بانک انصار"
                    Tat -> "بانک تات"
                    Hekmat -> "بانک حکمت ایرانیان"
                    Sina -> "بانک سینا"
                    MehrEghtesad -> "بانک مهر اقتصاد"
                    Ghavamin -> "بانک قوامین"
                    Ayande -> "بانک آینده"
                    Resalat -> "بانک رسالت"
                    else -> ""
                }
            } catch (e: Exception) {
                println(e.message)
                ""
            }
        }

        //endregion
        //region helper methods
        fun getCardFormat(bankEnum: BankEnum?): Array<String> {
            return try {
                when (bankEnum) {
                    None -> arrayOf("0")
                    Na -> arrayOf("0")
                    SaderatImprove -> arrayOf("207177", "627648")
                    Entrepreneur -> arrayOf("603770", "639217")
                    Sepah -> arrayOf("589210")
                    RefahWorkers -> arrayOf("589463")
                    Saderat -> arrayOf("603769")
                    Agricultural -> arrayOf("603770", "639217")
                    Melli -> arrayOf("603799")
                    Mellat -> arrayOf("610433", "991975")
                    Saman -> arrayOf("621986")
                    Parsian -> arrayOf("622106", "627884", "639194")
                    Tejarat -> arrayOf("627353")
                    EgtesadNovin -> arrayOf("627412")
                    PostBank -> arrayOf("627760")
                    Industry -> arrayOf("627961")
                    Maskan -> arrayOf("628023")
                    ImproveCredential -> arrayOf("628157")
                    Central -> arrayOf("636795")
                    Pasargad -> arrayOf("502229", "639347")
                    Capital -> arrayOf("639607", "504706")
                    City -> arrayOf("502806")
                    CooperationImprove -> arrayOf("502908")
                    Dey -> arrayOf("502938")
                    Travel -> arrayOf("505416")
                    IranZamin -> arrayOf("505785")
                    Kosar -> arrayOf("505801")
                    MeherIran -> arrayOf("606373")
                    Ansar -> arrayOf("627381")
                    Tat -> arrayOf("636214")
                    Hekmat -> arrayOf("636949")
                    Sina -> arrayOf("639346")
                    MehrEghtesad -> arrayOf("639370")
                    Ghavamin -> arrayOf("639599")
                    Ayande -> arrayOf("")
                    Resalat -> arrayOf("")
                    else -> arrayOf("0")
                }
            } catch (e: Exception) {
                println(e.message)
                arrayOf("0")
            }
        }

        fun getShebaFormat(bankEnum: BankEnum?): Array<String> {
            return try {
                when (bankEnum) {
                    None -> arrayOf("0")
                    Na -> arrayOf("0")
                    SaderatImprove -> arrayOf("020")
                    Entrepreneur -> arrayOf("053")
                    Sepah -> arrayOf("015")
                    RefahWorkers -> arrayOf("013")
                    Saderat -> arrayOf("019")
                    Agricultural -> arrayOf("016")
                    Melli -> arrayOf("017")
                    Mellat -> arrayOf("012")
                    Saman -> arrayOf("056")
                    Parsian -> arrayOf("054")
                    Tejarat -> arrayOf("018")
                    EgtesadNovin -> arrayOf("055")
                    PostBank -> arrayOf("021")
                    Industry -> arrayOf("011")
                    Maskan -> arrayOf("014")
                    ImproveCredential -> arrayOf("051")
                    Central -> arrayOf("010")
                    Pasargad -> arrayOf("057")
                    Capital -> arrayOf("058")
                    City -> arrayOf("061")
                    CooperationImprove -> arrayOf("022")
                    Dey -> arrayOf("066")
                    Travel -> arrayOf("064")
                    IranZamin -> arrayOf("069")
                    Kosar -> arrayOf("")
                    MeherIran -> arrayOf("060")
                    Ansar -> arrayOf("063")
                    Tat -> arrayOf("")
                    Hekmat -> arrayOf("065")
                    Sina -> arrayOf("059")
                    MehrEghtesad -> arrayOf("")
                    Ghavamin -> arrayOf("")
                    Ayande -> arrayOf("062")
                    Resalat -> arrayOf("070")
                    else -> arrayOf("0")
                }
            } catch (e: Exception) {
                println(e.message)
                arrayOf("0")
            }
        }

        fun getBankEnumByCardFormat(cardFormat: String?): BankEnum {
            return try {
                when (cardFormat) {
                    "0" -> Na
                    "207177", "627648" -> SaderatImprove
                    "502910", "627488" -> Entrepreneur
                    "589210" -> Sepah
                    "589463" -> RefahWorkers
                    "603769" -> Saderat
                    "603770", "639217" -> Agricultural
                    "603799" -> Melli
                    "610433", "991975" -> Mellat
                    "621986" -> Saman
                    "622106", "627884", "639194" -> Parsian
                    "627353" -> Tejarat
                    "627412" -> EgtesadNovin
                    "627760" -> PostBank
                    "627961" -> Industry
                    "628023" -> Maskan
                    "628157" -> ImproveCredential
                    "636795" -> Central
                    "502229", "639347" -> Pasargad
                    "639607" -> Capital
                    "502806", "504706" -> City
                    "502908" -> CooperationImprove
                    "502938" -> Dey
                    "505416" -> Travel
                    "505785" -> IranZamin
                    "505801" -> Kosar
                    "606373" -> MeherIran
                    "627381" -> Ansar
                    "636214" -> Tat
                    "636949" -> Hekmat
                    "639346" -> Sina
                    "639370" -> MehrEghtesad
                    "639599" -> Ghavamin
                    else -> Na
                }
            } catch (e: Exception) {
                println(e.message)
                Na
            }
        }

        fun getBankEnumByShebaFormat(cardFormat: String?): BankEnum {
            return try {
                when (cardFormat) {
                    "0" -> Na
                    "020" -> SaderatImprove
                    "053" -> Entrepreneur
                    "015" -> Sepah
                    "013" -> RefahWorkers
                    "019" -> Saderat
                    "016" -> Agricultural
                    "017" -> Melli
                    "012" -> Mellat
                    "056" -> Saman
                    "054" -> Parsian
                    "018" -> Tejarat
                    "055" -> EgtesadNovin
                    "021" -> PostBank
                    "011" -> Industry
                    "014" -> Maskan
                    "051" -> ImproveCredential
                    "010" -> Central
                    "057" -> Pasargad
                    "058" -> Capital
                    "061" -> City
                    "022" -> CooperationImprove
                    "066" -> Dey
                    "064" -> Travel
                    "069" -> IranZamin
                    "060" -> MeherIran
                    "063" -> Ansar
                    "065" -> Hekmat
                    "059" -> Sina
                    "062" -> Ayande
                    "070" -> Resalat
                    else -> Na
                }
            } catch (e: Exception) {
                println(e.message)
                Na
            }
        }

        fun isValidSheba(sheba: String): Boolean {
            var sheba = sheba
            return try {
                sheba = sheba.uppercase(Locale.getDefault())
                sheba = sheba.replace("A", "10")
                sheba = sheba.replace("B", "11")
                sheba = sheba.replace("C", "12")
                sheba = sheba.replace("D", "13")
                sheba = sheba.replace("E", "14")
                sheba = sheba.replace("F", "15")
                sheba = sheba.replace("G", "16")
                sheba = sheba.replace("H", "17")
                sheba = sheba.replace("I", "18")
                sheba = sheba.replace("J", "19")
                sheba = sheba.replace("K", "20")
                sheba = sheba.replace("L", "21")
                sheba = sheba.replace("M", "22")
                sheba = sheba.replace("N", "23")
                sheba = sheba.replace("O", "24")
                sheba = sheba.replace("P", "25")
                sheba = sheba.replace("Q", "26")
                sheba = sheba.replace("R", "27")
                sheba = sheba.replace("S", "28")
                sheba = sheba.replace("T", "29")
                sheba = sheba.replace("U", "30")
                sheba = sheba.replace("V", "31")
                sheba = sheba.replace("W", "32")
                sheba = sheba.replace("X", "33")
                sheba = sheba.replace("Y", "34")
                sheba = sheba.replace("Z", "35")
                val res = sheba.substring(0, 6)
                sheba += res
                val finalSheba = sheba.substring(6, sheba.length)
                val value = BigInteger(finalSheba)
                val nineSeven = BigInteger("97")
                val remain: BigInteger = value.remainder(nineSeven)
                remain.compareTo(BigInteger("1")) === 0
            } catch (e: Exception) {
                println(e.message)
                false
            }
        }

        fun splitSheba(sheba: String): String? {
            return try {
                var print = ""
                var div = 3
                var index = 0
                if (sheba.length > 1 && sheba.substring(0, 2)
                        .uppercase(Locale.getDefault()) === "IR"
                ) {
                    div = 1
                    index = 2
                    print += "IR-"
                }
                if (sheba.length > 2) {
                    for (i in index until sheba.length) {
                        if (i % 4 == div) {
                            if (i == sheba.length - 1) print += sheba.toCharArray()[i] else print += sheba.toCharArray()[i].toString() + "-"
                        } else print += sheba.toCharArray()[i]
                    }
                    return print
                }
                sheba
            } catch (e: Exception) {
                println(e.message)
                null
            }
        } //endregion
    }
}
