package cvsserver.server.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock implements Cloneable {
    @JsonProperty("code")
    private String code;
    @JsonProperty("low")
    private long low;
    @JsonProperty("top")
    private long top;
    @JsonProperty("current")
    private long current;
    @JsonProperty("name")
    private String name;
    @JsonProperty("volume")
    private long volume;
    @JsonProperty("open")
    private long open;
    @JsonProperty("close")
    private long close;
    @JsonProperty("date")
    private long date;

    public static List<Stock> getMockListStocks() {
        var mock = new String("[\n" +
                "  {\n" +
                "    \"code\": \"NYSE_0\",\n" +
                "    \"low\": 94227082,\n" +
                "    \"top\": 142194606,\n" +
                "    \"current\": 354817468,\n" +
                "    \"name\": \"Nuveen California Municipal Value Fund, Inc.\",\n" +
                "    \"volume\": 5352\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_1\",\n" +
                "    \"low\": 70998990,\n" +
                "    \"top\": 272779956,\n" +
                "    \"current\": 344296640,\n" +
                "    \"name\": \"Carolina Financial Corporation\",\n" +
                "    \"volume\": 10907\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_2\",\n" +
                "    \"low\": 27176765,\n" +
                "    \"top\": 252290240,\n" +
                "    \"current\": 227549675,\n" +
                "    \"name\": \"Tyson Foods, Inc.\",\n" +
                "    \"volume\": 5267\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_3\",\n" +
                "    \"low\": 24971686,\n" +
                "    \"top\": 85249019,\n" +
                "    \"current\": 296721378,\n" +
                "    \"name\": \"Tandy Leather Factory, Inc.\",\n" +
                "    \"volume\": 4007\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_4\",\n" +
                "    \"low\": 84085543,\n" +
                "    \"top\": 249525548,\n" +
                "    \"current\": 230464293,\n" +
                "    \"name\": \"Panhandle Royalty Company\",\n" +
                "    \"volume\": 16423\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_5\",\n" +
                "    \"low\": 35953211,\n" +
                "    \"top\": 67362004,\n" +
                "    \"current\": 241839964,\n" +
                "    \"name\": \"Southern Copper Corporation\",\n" +
                "    \"volume\": 7263\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_6\",\n" +
                "    \"low\": 79937809,\n" +
                "    \"top\": 71328595,\n" +
                "    \"current\": 28680859,\n" +
                "    \"name\": \"Urban One, Inc. \",\n" +
                "    \"volume\": 1860\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_7\",\n" +
                "    \"low\": 17279549,\n" +
                "    \"top\": 82083688,\n" +
                "    \"current\": 311264484,\n" +
                "    \"name\": \"Gol Linhas Aereas Inteligentes S.A.\",\n" +
                "    \"volume\": 9908\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_8\",\n" +
                "    \"low\": 17172842,\n" +
                "    \"top\": 122640335,\n" +
                "    \"current\": 296121471,\n" +
                "    \"name\": \"Adecoagro S.A.\",\n" +
                "    \"volume\": 18563\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_9\",\n" +
                "    \"low\": 76381708,\n" +
                "    \"top\": 52872795,\n" +
                "    \"current\": 233034713,\n" +
                "    \"name\": \"Blackrock MuniHoldings Fund II, Inc.\",\n" +
                "    \"volume\": 2427\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_10\",\n" +
                "    \"low\": 74319664,\n" +
                "    \"top\": 204995749,\n" +
                "    \"current\": 96474290,\n" +
                "    \"name\": \"Blackstone / GSO Strategic Credit Fund\",\n" +
                "    \"volume\": 7463\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_11\",\n" +
                "    \"low\": 89502315,\n" +
                "    \"top\": 197986261,\n" +
                "    \"current\": 248247510,\n" +
                "    \"name\": \"Key Tronic Corporation\",\n" +
                "    \"volume\": 11778\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_12\",\n" +
                "    \"low\": 30252392,\n" +
                "    \"top\": 135097129,\n" +
                "    \"current\": 80745210,\n" +
                "    \"name\": \"Evercore Partners Inc\",\n" +
                "    \"volume\": 9784\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_13\",\n" +
                "    \"low\": 61071220,\n" +
                "    \"top\": 210721588,\n" +
                "    \"current\": 265886961,\n" +
                "    \"name\": \"Conyers Park Acquisition Corp.\",\n" +
                "    \"volume\": 19996\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_14\",\n" +
                "    \"low\": 45643097,\n" +
                "    \"top\": 214053175,\n" +
                "    \"current\": 215918729,\n" +
                "    \"name\": \"Lsb Industries Inc.\",\n" +
                "    \"volume\": 18487\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_15\",\n" +
                "    \"low\": 36888872,\n" +
                "    \"top\": 172860417,\n" +
                "    \"current\": 125654659,\n" +
                "    \"name\": \"Natural Resource Partners LP\",\n" +
                "    \"volume\": 2173\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_16\",\n" +
                "    \"low\": 35338679,\n" +
                "    \"top\": 101065558,\n" +
                "    \"current\": 321675826,\n" +
                "    \"name\": \"Shell Midstream Partners, L.P.\",\n" +
                "    \"volume\": 12644\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_17\",\n" +
                "    \"low\": 70062664,\n" +
                "    \"top\": 24309608,\n" +
                "    \"current\": 317542136,\n" +
                "    \"name\": \"Merus N.V.\",\n" +
                "    \"volume\": 13014\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_18\",\n" +
                "    \"low\": 29837357,\n" +
                "    \"top\": 62680911,\n" +
                "    \"current\": 265407095,\n" +
                "    \"name\": \"VelocityShares Daily 2x VIX Medium-Term ETN\",\n" +
                "    \"volume\": 15183\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_19\",\n" +
                "    \"low\": 9944882,\n" +
                "    \"top\": 280673257,\n" +
                "    \"current\": 238077027,\n" +
                "    \"name\": \"GlycoMimetics, Inc.\",\n" +
                "    \"volume\": 11192\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_20\",\n" +
                "    \"low\": 63044006,\n" +
                "    \"top\": 55442567,\n" +
                "    \"current\": 239824090,\n" +
                "    \"name\": \"Cheetah Mobile Inc.\",\n" +
                "    \"volume\": 11713\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_21\",\n" +
                "    \"low\": 59420987,\n" +
                "    \"top\": 9200432,\n" +
                "    \"current\": 355624503,\n" +
                "    \"name\": \"ServiceMaster Global Holdings, Inc.\",\n" +
                "    \"volume\": 9380\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_22\",\n" +
                "    \"low\": 35064266,\n" +
                "    \"top\": 259003817,\n" +
                "    \"current\": 360760943,\n" +
                "    \"name\": \"Chuy's Holdings, Inc.\",\n" +
                "    \"volume\": 14584\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_23\",\n" +
                "    \"low\": 79168324,\n" +
                "    \"top\": 53242896,\n" +
                "    \"current\": 16775226,\n" +
                "    \"name\": \"LMI Aerospace, Inc.\",\n" +
                "    \"volume\": 13612\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_24\",\n" +
                "    \"low\": 79016011,\n" +
                "    \"top\": 3281584,\n" +
                "    \"current\": 208915356,\n" +
                "    \"name\": \"CTI BioPharma Corp.\",\n" +
                "    \"volume\": 10061\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_25\",\n" +
                "    \"low\": 41075954,\n" +
                "    \"top\": 106082164,\n" +
                "    \"current\": 382471728,\n" +
                "    \"name\": \"Coca-Cola Company (The)\",\n" +
                "    \"volume\": 14728\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_26\",\n" +
                "    \"low\": 14090608,\n" +
                "    \"top\": 265910742,\n" +
                "    \"current\": 212274563,\n" +
                "    \"name\": \"Carbonite, Inc.\",\n" +
                "    \"volume\": 4007\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_27\",\n" +
                "    \"low\": 4052096,\n" +
                "    \"top\": 173634606,\n" +
                "    \"current\": 91429982,\n" +
                "    \"name\": \"Countrywide Financial Corporation\",\n" +
                "    \"volume\": 18438\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_28\",\n" +
                "    \"low\": 36361316,\n" +
                "    \"top\": 154807482,\n" +
                "    \"current\": 45783321,\n" +
                "    \"name\": \"Acacia Communications, Inc.\",\n" +
                "    \"volume\": 6024\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_29\",\n" +
                "    \"low\": 60767087,\n" +
                "    \"top\": 93916928,\n" +
                "    \"current\": 264660838,\n" +
                "    \"name\": \"Commercial Metals Company\",\n" +
                "    \"volume\": 7014\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_30\",\n" +
                "    \"low\": 43704636,\n" +
                "    \"top\": 221922025,\n" +
                "    \"current\": 68125203,\n" +
                "    \"name\": \"Andina Acquisition Corp. II\",\n" +
                "    \"volume\": 19784\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_31\",\n" +
                "    \"low\": 11582552,\n" +
                "    \"top\": 172950163,\n" +
                "    \"current\": 159939306,\n" +
                "    \"name\": \"QEP Resources, Inc.\",\n" +
                "    \"volume\": 6683\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_32\",\n" +
                "    \"low\": 33760975,\n" +
                "    \"top\": 228267769,\n" +
                "    \"current\": 37785564,\n" +
                "    \"name\": \"General Finance Corporation\",\n" +
                "    \"volume\": 565\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_33\",\n" +
                "    \"low\": 43264482,\n" +
                "    \"top\": 166446929,\n" +
                "    \"current\": 339814047,\n" +
                "    \"name\": \"Talend S.A.\",\n" +
                "    \"volume\": 11167\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_34\",\n" +
                "    \"low\": 25137747,\n" +
                "    \"top\": 292402721,\n" +
                "    \"current\": 399154668,\n" +
                "    \"name\": \"Easterly Acquisition Corp.\",\n" +
                "    \"volume\": 8414\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_35\",\n" +
                "    \"low\": 26778505,\n" +
                "    \"top\": 7972031,\n" +
                "    \"current\": 170765974,\n" +
                "    \"name\": \"American Homes 4 Rent\",\n" +
                "    \"volume\": 4118\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_36\",\n" +
                "    \"low\": 76835707,\n" +
                "    \"top\": 243024896,\n" +
                "    \"current\": 24536576,\n" +
                "    \"name\": \"FMC Corporation\",\n" +
                "    \"volume\": 3953\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_37\",\n" +
                "    \"low\": 41927662,\n" +
                "    \"top\": 26370426,\n" +
                "    \"current\": 65386266,\n" +
                "    \"name\": \"Telecom Italia S.P.A.\",\n" +
                "    \"volume\": 11381\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_38\",\n" +
                "    \"low\": 23699397,\n" +
                "    \"top\": 82002907,\n" +
                "    \"current\": 168876899,\n" +
                "    \"name\": \"Hanmi Financial Corporation\",\n" +
                "    \"volume\": 13268\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_39\",\n" +
                "    \"low\": 86068157,\n" +
                "    \"top\": 68101980,\n" +
                "    \"current\": 84824976,\n" +
                "    \"name\": \"ProPetro Holding Corp.\",\n" +
                "    \"volume\": 7669\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_40\",\n" +
                "    \"low\": 59610537,\n" +
                "    \"top\": 150426715,\n" +
                "    \"current\": 240658081,\n" +
                "    \"name\": \"First Trust NASDAQ Smartphone Index Fund\",\n" +
                "    \"volume\": 4271\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_41\",\n" +
                "    \"low\": 39427260,\n" +
                "    \"top\": 217852043,\n" +
                "    \"current\": 355042087,\n" +
                "    \"name\": \"Emmis Communications Corporation\",\n" +
                "    \"volume\": 4858\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_42\",\n" +
                "    \"low\": 51329737,\n" +
                "    \"top\": 36718547,\n" +
                "    \"current\": 183869753,\n" +
                "    \"name\": \"Neonode Inc.\",\n" +
                "    \"volume\": 12897\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_43\",\n" +
                "    \"low\": 55309612,\n" +
                "    \"top\": 252060787,\n" +
                "    \"current\": 244259029,\n" +
                "    \"name\": \"PHI, Inc.\",\n" +
                "    \"volume\": 7562\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_44\",\n" +
                "    \"low\": 90693301,\n" +
                "    \"top\": 274186583,\n" +
                "    \"current\": 100901896,\n" +
                "    \"name\": \"Triangle Capital Corporation\",\n" +
                "    \"volume\": 4493\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_45\",\n" +
                "    \"low\": 72045728,\n" +
                "    \"top\": 252098535,\n" +
                "    \"current\": 205616981,\n" +
                "    \"name\": \"Bay Bancorp, Inc.\",\n" +
                "    \"volume\": 8897\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_46\",\n" +
                "    \"low\": 88183788,\n" +
                "    \"top\": 229356832,\n" +
                "    \"current\": 196456532,\n" +
                "    \"name\": \"National Storage Affiliates Trust\",\n" +
                "    \"volume\": 15644\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_47\",\n" +
                "    \"low\": 47430109,\n" +
                "    \"top\": 165952824,\n" +
                "    \"current\": 346823784,\n" +
                "    \"name\": \"Lightbridge Corporation\",\n" +
                "    \"volume\": 13965\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_48\",\n" +
                "    \"low\": 53269251,\n" +
                "    \"top\": 191802618,\n" +
                "    \"current\": 216322437,\n" +
                "    \"name\": \"Applied DNA Sciences Inc\",\n" +
                "    \"volume\": 4214\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_49\",\n" +
                "    \"low\": 67620787,\n" +
                "    \"top\": 26140620,\n" +
                "    \"current\": 86225478,\n" +
                "    \"name\": \"Voya Global Advantage and Premium Opportunity Fund\",\n" +
                "    \"volume\": 18261\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_50\",\n" +
                "    \"low\": 71080209,\n" +
                "    \"top\": 175194134,\n" +
                "    \"current\": 363948917,\n" +
                "    \"name\": \"Middlefield Banc Corp.\",\n" +
                "    \"volume\": 2726\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_51\",\n" +
                "    \"low\": 36351980,\n" +
                "    \"top\": 35507899,\n" +
                "    \"current\": 63102139,\n" +
                "    \"name\": \"The Blackstone Group L.P.\",\n" +
                "    \"volume\": 14832\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_52\",\n" +
                "    \"low\": 14211524,\n" +
                "    \"top\": 276827276,\n" +
                "    \"current\": 316468071,\n" +
                "    \"name\": \"Avery Dennison Corporation\",\n" +
                "    \"volume\": 11266\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_53\",\n" +
                "    \"low\": 43498493,\n" +
                "    \"top\": 214545360,\n" +
                "    \"current\": 155155443,\n" +
                "    \"name\": \"AveXis, Inc.\",\n" +
                "    \"volume\": 6777\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_54\",\n" +
                "    \"low\": 30016985,\n" +
                "    \"top\": 43537297,\n" +
                "    \"current\": 351151161,\n" +
                "    \"name\": \"Vantage Energy Acquisition Corp.\",\n" +
                "    \"volume\": 163\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_55\",\n" +
                "    \"low\": 69459949,\n" +
                "    \"top\": 118019070,\n" +
                "    \"current\": 317762346,\n" +
                "    \"name\": \"NICE Ltd\",\n" +
                "    \"volume\": 6624\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_56\",\n" +
                "    \"low\": 65978188,\n" +
                "    \"top\": 297072836,\n" +
                "    \"current\": 96833699,\n" +
                "    \"name\": \"Vanguard Total International Stock ETF\",\n" +
                "    \"volume\": 12924\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_57\",\n" +
                "    \"low\": 60409941,\n" +
                "    \"top\": 121132744,\n" +
                "    \"current\": 294640991,\n" +
                "    \"name\": \"Eastman Kodak Company\",\n" +
                "    \"volume\": 6033\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_58\",\n" +
                "    \"low\": 2218169,\n" +
                "    \"top\": 248539462,\n" +
                "    \"current\": 223769921,\n" +
                "    \"name\": \"Lazard Ltd.\",\n" +
                "    \"volume\": 18639\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_59\",\n" +
                "    \"low\": 76521746,\n" +
                "    \"top\": 83009411,\n" +
                "    \"current\": 139090025,\n" +
                "    \"name\": \"WEX Inc.\",\n" +
                "    \"volume\": 764\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_60\",\n" +
                "    \"low\": 27016140,\n" +
                "    \"top\": 174019741,\n" +
                "    \"current\": 102673877,\n" +
                "    \"name\": \"First Trust Total US Market AlphaDEX ETF\",\n" +
                "    \"volume\": 12609\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_61\",\n" +
                "    \"low\": 86291584,\n" +
                "    \"top\": 11796999,\n" +
                "    \"current\": 118464438,\n" +
                "    \"name\": \"Greenhill & Co., Inc.\",\n" +
                "    \"volume\": 6998\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_62\",\n" +
                "    \"low\": 48271974,\n" +
                "    \"top\": 213047486,\n" +
                "    \"current\": 225215354,\n" +
                "    \"name\": \"FuelCell Energy, Inc.\",\n" +
                "    \"volume\": 9562\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_63\",\n" +
                "    \"low\": 34257943,\n" +
                "    \"top\": 157861336,\n" +
                "    \"current\": 396887193,\n" +
                "    \"name\": \"Benitec Biopharma Limited\",\n" +
                "    \"volume\": 3832\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_64\",\n" +
                "    \"low\": 39023987,\n" +
                "    \"top\": 238298863,\n" +
                "    \"current\": 203579041,\n" +
                "    \"name\": \"CMS Energy Corporation\",\n" +
                "    \"volume\": 5574\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_65\",\n" +
                "    \"low\": 48447898,\n" +
                "    \"top\": 17597757,\n" +
                "    \"current\": 146180984,\n" +
                "    \"name\": \"Varex Imaging Corporation\",\n" +
                "    \"volume\": 1497\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_66\",\n" +
                "    \"low\": 53764404,\n" +
                "    \"top\": 274862162,\n" +
                "    \"current\": 367093792,\n" +
                "    \"name\": \"Qiagen N.V.\",\n" +
                "    \"volume\": 1023\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_67\",\n" +
                "    \"low\": 63288718,\n" +
                "    \"top\": 125536877,\n" +
                "    \"current\": 96667802,\n" +
                "    \"name\": \"Avinger, Inc.\",\n" +
                "    \"volume\": 1968\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_68\",\n" +
                "    \"low\": 32556681,\n" +
                "    \"top\": 92459916,\n" +
                "    \"current\": 303210417,\n" +
                "    \"name\": \"Automatic Data Processing, Inc.\",\n" +
                "    \"volume\": 10175\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_69\",\n" +
                "    \"low\": 69228000,\n" +
                "    \"top\": 192667766,\n" +
                "    \"current\": 11623989,\n" +
                "    \"name\": \"EXFO Inc\",\n" +
                "    \"volume\": 14604\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_70\",\n" +
                "    \"low\": 52183579,\n" +
                "    \"top\": 102296847,\n" +
                "    \"current\": 12178407,\n" +
                "    \"name\": \"ABAXIS, Inc.\",\n" +
                "    \"volume\": 8892\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_71\",\n" +
                "    \"low\": 12694913,\n" +
                "    \"top\": 285557260,\n" +
                "    \"current\": 394234801,\n" +
                "    \"name\": \"China Information Technology, Inc.\",\n" +
                "    \"volume\": 5561\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_72\",\n" +
                "    \"low\": 25820439,\n" +
                "    \"top\": 132027193,\n" +
                "    \"current\": 196095832,\n" +
                "    \"name\": \"Great Elm Capital Corp.\",\n" +
                "    \"volume\": 7398\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_73\",\n" +
                "    \"low\": 18499030,\n" +
                "    \"top\": 72535057,\n" +
                "    \"current\": 103333577,\n" +
                "    \"name\": \"CoStar Group, Inc.\",\n" +
                "    \"volume\": 11800\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_74\",\n" +
                "    \"low\": 71280358,\n" +
                "    \"top\": 142911727,\n" +
                "    \"current\": 103524614,\n" +
                "    \"name\": \"OCI Partners LP\",\n" +
                "    \"volume\": 19897\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_75\",\n" +
                "    \"low\": 28235066,\n" +
                "    \"top\": 80921071,\n" +
                "    \"current\": 9297816,\n" +
                "    \"name\": \"Aberdeen Greater China Fund, Inc.\",\n" +
                "    \"volume\": 6227\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_76\",\n" +
                "    \"low\": 76128039,\n" +
                "    \"top\": 121108233,\n" +
                "    \"current\": 71754354,\n" +
                "    \"name\": \"Duke Energy Corporation\",\n" +
                "    \"volume\": 14018\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_77\",\n" +
                "    \"low\": 75778868,\n" +
                "    \"top\": 27811923,\n" +
                "    \"current\": 281823159,\n" +
                "    \"name\": \"Turquoise Hill Resources Ltd.\",\n" +
                "    \"volume\": 6921\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_78\",\n" +
                "    \"low\": 32406658,\n" +
                "    \"top\": 151542277,\n" +
                "    \"current\": 277603913,\n" +
                "    \"name\": \"MBIA, Inc.\",\n" +
                "    \"volume\": 16181\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_79\",\n" +
                "    \"low\": 22289270,\n" +
                "    \"top\": 283669235,\n" +
                "    \"current\": 127140987,\n" +
                "    \"name\": \"Franklin Electric Co., Inc.\",\n" +
                "    \"volume\": 13544\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_80\",\n" +
                "    \"low\": 26511237,\n" +
                "    \"top\": 89907531,\n" +
                "    \"current\": 170453339,\n" +
                "    \"name\": \"Foundation Medicine, Inc.\",\n" +
                "    \"volume\": 8246\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_81\",\n" +
                "    \"low\": 96429305,\n" +
                "    \"top\": 97378500,\n" +
                "    \"current\": 170022217,\n" +
                "    \"name\": \"LG Display Co., Ltd.\",\n" +
                "    \"volume\": 7330\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_82\",\n" +
                "    \"low\": 41657579,\n" +
                "    \"top\": 226979192,\n" +
                "    \"current\": 178332763,\n" +
                "    \"name\": \"Horizons DAX Germany ETF\",\n" +
                "    \"volume\": 6506\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_83\",\n" +
                "    \"low\": 66376090,\n" +
                "    \"top\": 292642435,\n" +
                "    \"current\": 153813527,\n" +
                "    \"name\": \"Bank of America Corporation\",\n" +
                "    \"volume\": 4226\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_84\",\n" +
                "    \"low\": 97271638,\n" +
                "    \"top\": 296937856,\n" +
                "    \"current\": 25643594,\n" +
                "    \"name\": \"Rent-A-Center Inc.\",\n" +
                "    \"volume\": 13519\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_85\",\n" +
                "    \"low\": 79600203,\n" +
                "    \"top\": 247913489,\n" +
                "    \"current\": 131517732,\n" +
                "    \"name\": \"Sears Holdings Corporation\",\n" +
                "    \"volume\": 16171\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_86\",\n" +
                "    \"low\": 22863257,\n" +
                "    \"top\": 272710823,\n" +
                "    \"current\": 29095501,\n" +
                "    \"name\": \"NewStar Financial, Inc.\",\n" +
                "    \"volume\": 14174\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_87\",\n" +
                "    \"low\": 29678113,\n" +
                "    \"top\": 202382798,\n" +
                "    \"current\": 222095396,\n" +
                "    \"name\": \"Papa John's International, Inc.\",\n" +
                "    \"volume\": 13585\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_88\",\n" +
                "    \"low\": 39004107,\n" +
                "    \"top\": 55452582,\n" +
                "    \"current\": 85516757,\n" +
                "    \"name\": \"Vipshop Holdings Limited\",\n" +
                "    \"volume\": 4769\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_89\",\n" +
                "    \"low\": 25459283,\n" +
                "    \"top\": 290685670,\n" +
                "    \"current\": 111089850,\n" +
                "    \"name\": \"TRC Companies, Inc.\",\n" +
                "    \"volume\": 14148\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_90\",\n" +
                "    \"low\": 87032364,\n" +
                "    \"top\": 16684269,\n" +
                "    \"current\": 186680534,\n" +
                "    \"name\": \"Hologic, Inc.\",\n" +
                "    \"volume\": 15020\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_91\",\n" +
                "    \"low\": 42589711,\n" +
                "    \"top\": 92722874,\n" +
                "    \"current\": 343120111,\n" +
                "    \"name\": \"Diana Containerships Inc.\",\n" +
                "    \"volume\": 2121\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_92\",\n" +
                "    \"low\": 43659401,\n" +
                "    \"top\": 100464279,\n" +
                "    \"current\": 239450898,\n" +
                "    \"name\": \"Simulations Plus, Inc.\",\n" +
                "    \"volume\": 19600\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_93\",\n" +
                "    \"low\": 52605525,\n" +
                "    \"top\": 20286780,\n" +
                "    \"current\": 319980001,\n" +
                "    \"name\": \"Employers Holdings Inc\",\n" +
                "    \"volume\": 5783\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_94\",\n" +
                "    \"low\": 99017903,\n" +
                "    \"top\": 43138794,\n" +
                "    \"current\": 302481719,\n" +
                "    \"name\": \"BP p.l.c.\",\n" +
                "    \"volume\": 3681\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_95\",\n" +
                "    \"low\": 29439998,\n" +
                "    \"top\": 262898113,\n" +
                "    \"current\": 339313682,\n" +
                "    \"name\": \"Guess?, Inc.\",\n" +
                "    \"volume\": 19222\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_96\",\n" +
                "    \"low\": 66132249,\n" +
                "    \"top\": 293460520,\n" +
                "    \"current\": 387352344,\n" +
                "    \"name\": \"Kansas City Southern\",\n" +
                "    \"volume\": 18069\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NYSE_97\",\n" +
                "    \"low\": 14155716,\n" +
                "    \"top\": 238711438,\n" +
                "    \"current\": 277457499,\n" +
                "    \"name\": \"Dreyfus Strategic Municipals, Inc.\",\n" +
                "    \"volume\": 8846\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_98\",\n" +
                "    \"low\": 83786389,\n" +
                "    \"top\": 189485239,\n" +
                "    \"current\": 355312518,\n" +
                "    \"name\": \"support.com, Inc.\",\n" +
                "    \"volume\": 2525\n" +
                "  },\n" +
                "  {\n" +
                "    \"code\": \"NASDAQ_99\",\n" +
                "    \"low\": 10422523,\n" +
                "    \"top\": 77593847,\n" +
                "    \"current\": 98218734,\n" +
                "    \"name\": \"United Security Bancshares\",\n" +
                "    \"volume\": 13922\n" +
                "  }\n" +
                "]\n");
        var mapper = new ObjectMapper();
        try {
            return Arrays.asList(mapper.readValue(mock, Stock[].class));
        } catch (JsonProcessingException e) {
            System.out.println("Fail to map: " + e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        var objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try {
            return objectWriter.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
