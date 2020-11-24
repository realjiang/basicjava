//package constants;
//
//import com.google.common.collect.ImmutableMap;
//
//import java.util.Map;
//
///**
// * 标题: 码值维护(数据中心→二品一械系统码值)
// *
// * @Author: Jiang
// * @Date: 2020/8/28 14:04
// */
//public final class CodeConstants {
//    private CodeConstants(){}
//
//    /**
//     * 许可信息-许可证类型
//     */
//    public static final String LPYX_XKLX_YPSC = "1"; // 1药品生产
//    public static final String LPYX_XKLX_YPJY = "2"; // 2 药品经营
//    public static final String LPYX_XKLX_YLQXSC = "3"; // 3医疗器械生产
//    public static final String LPYX_XKLX_HZPSC = "4"; // 4化妆品生产
//    public static final String LPYX_XKLX_YLQXJY = "5"; // 5医疗器械经营
//    public static final String LPYX_XKLX_YLJGZJSC = "7"; // 7医疗机构制剂生产
//
//    /**标识是哪类许可:0药品生产-普通1药品生产-中药提取物2药品生产-药用辅料3其他许可*/
//    public static final String LPYX_XKLX_YPSC_YYFL = "0";// 0药用辅料
//    public static final String LPYX_XKLX_YPSC_PT = "1";// 1药品生产-普通
//    public static final String LPYX_XKLX_YPSC_ZYTQW = "2";// 2中药提取物
//
//    /** 药品注册分类*/
//    public static final Map<String, String> LPYX_YPZCFL = new ImmutableMap.Builder<String, String>()
//            .put("中药", "1")
//            .put("化学药", "2")
//            .put("生物制品", "3")
//            .put("辅料", "4")
//            .build();
//
//    /** 许可信息-许可证类型*/
//    public static final Map<String, String> LPYX_XK_XKZLX = new ImmutableMap.Builder<String, String>()
//            .put("211", "1") //1药品生产许可
//            .put("221", "2") //2 药品经营
//            .put("341", "3") // 3医疗器械生产(第一类医疗器械生产备案)
//            .put("311", "3") // 3医疗器械生产(第二类医疗器械生产许可证)
//            .put("999", "3") // 3医疗器械生产(第三类医疗器械生产许可证)
//            .put("411", "4") // 4化妆品生产
//            .put("322", "5") // 5医疗器械经营(二类医疗器械经营备案)
//            .put("321", "5") // 5医疗器械经营(医疗器械经营许可证)
//            .put("511", "7") // 7医疗机构制剂许可证
////            .put("未知", "8") // 8化妆品经营许可证
//            .build();
//
//    /** 许可信息-医疗器械类别（一类，二类，三类）*/
//    public static final Map<String, String> LPYX_XK_YLQXLB = new ImmutableMap.Builder<String, String>()
//            .put("341", "0") // 一类
//            .put("311", "1") // 二类 医疗器械生产(第二类医疗器械生产许可证)
//            .put("999", "2") // 三类 医疗器械生产(第三类医疗器械生产许可证)
//            .put("322", "1") // 二类 医疗器械经营(二类医疗器械经营备案)
//            .put("321", "2") //三类 医疗器械经营(医疗器械经营许可证)
//            .put("311,999", "1,2") //二类,三类 医疗器械生产,既是二类又是三类
//            .build();
//
//    /**许可信息-经营方式(医疗器械经营)*/
//    public static final Map<String, String> LPYX_XK_YLQXJYFS = new ImmutableMap.Builder<String, String>()
//            .put("1", "1") // 批发
//            .put("2", "2") // 零售
//            .put("3", "3") // 批零兼营
//            .build();
//
//    /**许可信息-经营方式(药品经营)*/
//    public static final Map<String, String> LPYX_XK_YPJYFS = new ImmutableMap.Builder<String, String>()
//            .put("1", "1") //批发
//            .put("2", "2") //零售
//            .put("3", "4") //连锁(总部)
//            .put("4", "5") //零售(连锁)
//            .build();
//
//    /** 产品信息- 医疗器械 -管理类别*/
//    public static final Map<String, String> LPYX_YLQX_GLLB = new ImmutableMap.Builder<String, String>()
//            .put("1", "0") //一类
//            .put("2", "1") //二类
//            .put("3", "2") //三类
//            .build();
//
//}
