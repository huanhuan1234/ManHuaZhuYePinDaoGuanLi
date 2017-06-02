package bawei.com.manhuazhuyepindaoguanli.bean;

import java.util.List;

/**
 * Created by Huangminghuan on 2017/6/2.
 */

public class WeekInfoBean {

    private int day;
    private long daytime;

    public WeekInfoBean(int day, long daytime) {
        this.day = day;
        this.daytime = daytime;
    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public long getDaytime() {
        return daytime;
    }

    public void setDaytime(long daytime) {
        this.daytime = daytime;
    }

    /**
     * code : 200
     * data : {"comics":[{"info_type":0,"can_view":true,"label_color":"#be32ff","cover_image_url":"http://f2.kkmh.com/image/170601/zx427bu0r.webp-w640","storyboard_cnt":99,"created_at":1496367036,"title":"第53话 你想要的，我都会给你","url":"http://www.kuaikanmanhua.com/comics/26194","likes_count":216419,"updated_at":1496309237,"selling_kk_currency":0,"comments_count":4188,"label_text":"穿越","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161220/idr1o1juw.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160826/qq34tzx5q.webp-w640","update_day":"(每周五更新)","description":"古风类榜单总热度第一名！现代小萝莉家里从天而降了一个超帅的古代锦衣卫！缺失父母关怀的小萝莉把他当成了最亲近的人，竟要当他的童养媳？！表面傲娇冷漠挑剔的他，却越来越放不下这个小家伙...画风超级赞的养成系古风恋爱！\r\n【独家/每周五更新   责编：林早上】","created_at":1454327806,"title":"我男票是锦衣卫","update_status":"连载中","updated_at":1454327806,"id":709,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160201/rna6levqw.webp-w180","grade":1,"nickname":"ZQQ虹OR虹君 ","reg_type":"author","id":6835950},"label_id":18,"order":450,"comics_count":55},"shared_count":0,"id":26194,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/xfttlajpa.webp-w640","storyboard_cnt":60,"created_at":1496366432,"title":"第22话 心动与遇袭","url":"http://www.kuaikanmanhua.com/comics/26205","likes_count":183469,"updated_at":1496314651,"selling_kk_currency":0,"comments_count":2646,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161226/th1gzi9gn.webp-w320","cover_image_url":"http://f2.kkmh.com/image/161226/0nk746yec.webp-w640","update_day":"(每周四更新)","description":"武力值MAX的道场继承人\u2014\u2014向小满，为了追男神，决定江湖洗手，转校做一个安安静静的柔弱女子。而未曾想到的是，踏入校园第一天，男神还没追到，却因超凡的战斗力，被学校不良少年误认为男神。究竟小满能否成为男神心中的理想型，顺利转变现有的画风呢？【独家/每周四更新 责编：半石】","created_at":1482734574,"title":"当校霸爱上学霸","update_status":"连载中","updated_at":1482734574,"id":991,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/161226/qcezbh4i7.webp-w180","grade":1,"nickname":"灿灿 /夏天岛","reg_type":"author","id":28863310},"label_id":15,"order":400,"comics_count":25},"shared_count":0,"id":26205,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/129uxp01x.webp-w640","storyboard_cnt":33,"created_at":1496365833,"title":"第76话（下）你属于我","url":"http://www.kuaikanmanhua.com/comics/26209","likes_count":175346,"updated_at":1496317324,"selling_kk_currency":0,"comments_count":6609,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161220/6bti83qdn.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170105/ny470sr9w.webp-w640","update_day":"(每周一更新)","description":"恋爱类总榜热度第一名少女漫！当红人气鲜肉被曝毕业证做假仅考零分，回大学重修遇见贫穷土鳖学霸女，地位不对等的恋爱会有结果么？超强剧情，快来体验最心动，最浪漫，最苏最撩的爱情！！\r\n【独家/每周一更新  责编：33 】\r\n","created_at":1436162270,"title":"零分偶像","update_status":"连载中","updated_at":1436162270,"id":363,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150706/49kpat7nq.jpg-w180","grade":1,"nickname":"青庭","reg_type":"author","id":459327},"label_id":15,"order":600,"comics_count":89},"shared_count":0,"id":26209,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#44e36e","cover_image_url":"http://f2.kkmh.com/image/170526/v5kms66yq.webp-w640","storyboard_cnt":90,"created_at":1496365555,"title":"第4话 所谓\u201c朋友\u201d","url":"http://www.kuaikanmanhua.com/comics/25849","likes_count":72313,"updated_at":1495612507,"selling_kk_currency":0,"comments_count":400,"label_text":"校园","zoomable":0,"is_free":true,"push_flag":0,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170506/16x2spnzk.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170506/qe8fsboha.webp-w640","update_day":"(每周六更新)","description":"尹泰民意外穿越到了被同学欺负而自杀的韩施源身上后，重返学校一雪前耻，却没想到在学校遇到了识破自己身份的童年好友闵佑真，自此两个人的羁绊再度展开。【独家/每周六更新或支付KK币抢先看 责编：Uncle】","created_at":1494084403,"title":"在那尽头","update_status":"连载中","updated_at":1494084403,"id":1100,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170506/ply18ouz9.webp-w180","grade":1,"nickname":"HARIBO","reg_type":"author","id":40397658},"label_id":44,"order":0,"comics_count":16},"shared_count":0,"id":25849,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/8f6143j9b.webp-w640","storyboard_cnt":40,"created_at":1496365230,"title":"第30话 我一直很在意你！","url":"http://www.kuaikanmanhua.com/comics/26176","likes_count":126925,"updated_at":1496287752,"selling_kk_currency":0,"comments_count":3097,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161214/e9k4pap5h.webp-w320","cover_image_url":"http://f2.kkmh.com/image/161214/rhwm57v5f.webp-w640","update_day":"(每周五更新)","description":"上线第一话空降周榜TOP1，让你脸红心跳的少女漫！舞台剧中扮演王子的青梅竹马，竟当众触碰了我的唇，那可是我保留多年的初吻啊！可是这柔软而温暖的触感，以及快要无法呼吸的感觉，是怎么回事？男主超会撩妹！少女们快到碗里来！【独家/每周五更新，责编：珉xi 】","created_at":1481708960,"title":"还有一秒吻上你","update_status":"连载中","updated_at":1481708960,"id":979,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/161214/ld1a5vxlc.webp-w180","grade":1,"nickname":"Sui Souda","reg_type":"author","id":28374759},"label_id":15,"order":400,"comics_count":31},"shared_count":0,"id":26176,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#6e68ff","cover_image_url":"http://f2.kkmh.com/image/170601/16wtbic49.webp-w640","storyboard_cnt":60,"created_at":1496364931,"title":"第50话 他的孩子","url":"http://www.kuaikanmanhua.com/comics/26175","likes_count":77966,"updated_at":1496286577,"selling_kk_currency":0,"comments_count":885,"label_text":"剧情","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"http://f2.kkmh.com/image/160625/ibeyq3xel.webp-w750","vertical_image_url":"http://f2.kkmh.com/image/161226/0fs1aoqkd.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160728/j0ult13jz.webp-w640","update_day":"(每周五更新)","description":"奇幻类总热度TOP3作品！史上脾气最冲最不讲理年纪最大的少女漫女主角，77岁还要闹离婚？！离婚大戏正要上演，老夫妻却意外重返17岁，以年轻的肉体开始了一段崭新的生活\u2026\u2026【独家/每周五更新 责编：半石】","created_at":1466662141,"title":"欧巴！我们离婚吧！","update_status":"连载中","updated_at":1466662141,"id":856,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/160623/av9exudlp.webp-w180","grade":1,"nickname":"BAE Go-eun/Daum Webtoon","reg_type":"author","id":15321685},"label_id":17,"order":550,"comics_count":51},"shared_count":0,"id":26175,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#b400fa","cover_image_url":"http://f2.kkmh.com/image/170531/p5cqrz1vv.webp-w640","storyboard_cnt":65,"created_at":1496364569,"title":"第四季 第10话 女孩们","url":"http://www.kuaikanmanhua.com/comics/26133","likes_count":51968,"updated_at":1496201982,"selling_kk_currency":0,"comments_count":650,"label_text":"都市","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161212/50jz03pjz.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170105/2e8cr7uxu.webp-w640","update_day":"(每周五更新)","description":"根据顶级援交女的真实事件改编。姐姐为抚养妹妹踏入风尘，不幸卷入权利道德的旋涡丧生，妹妹决定进入这个黑暗世界，寻找真相。这部激情而不色情的漫画，深度剖析人性，揭露社会阴暗角落里为生存身不由己的群体。你愿意做正直的便宜货，还是高贵的垃圾？寻找震撼心灵有深度漫画的读者，不要错过！！\r\n【独家/每周五更新  责编：Uncle】","created_at":1453363785,"title":"头牌名媛","update_status":"连载中","updated_at":1453363785,"id":693,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170314/wxl2mav9u.webp-w180","grade":1,"nickname":"韩东圩+尹仁完+秉秀氏","reg_type":"author","id":37027243},"label_id":11,"order":500,"comics_count":75},"shared_count":0,"id":26133,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/44749qwwi.webp-w640","storyboard_cnt":33,"created_at":1496364024,"title":"第80话 突然的温暖","url":"http://www.kuaikanmanhua.com/comics/26207","likes_count":114823,"updated_at":1496316135,"selling_kk_currency":0,"comments_count":1543,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170110/wnsosvdxv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170110/0s3makjzb.webp-w640","update_day":"","description":"她是一直被误认为男生的黑道少女，他是同为黑道世家的纯良少爷。十年后，\u201c假小子\u201d变成冷酷无情的大姐头，他们会以怎样的方式重遇？怀着绅士之心点开，你一定以为这是个H漫\u2026\u2026【独家/每周五更新  责编:33】","created_at":1451473729,"title":"论不良少女调教方式","update_status":"连载中","updated_at":1451473729,"id":667,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/151230/vbjktjyq3.webp-w180","grade":1,"nickname":"梁赫文","reg_type":"author","id":5575228},"label_id":15,"order":200,"comics_count":81},"shared_count":0,"id":26207,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#b400fa","cover_image_url":"http://f2.kkmh.com/image/170601/58f8m7cug.webp-w640","storyboard_cnt":30,"created_at":1496363368,"title":"第6话 难道我们要24小时呆在一起？","url":"http://www.kuaikanmanhua.com/comics/25047","likes_count":51335,"updated_at":1493952744,"selling_kk_currency":0,"comments_count":414,"label_text":"都市","zoomable":0,"is_free":true,"push_flag":0,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170503/n73xgb1gd.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170503/9atjo7aie.webp-w640","update_day":"(每周五更新)","description":"高中时样样完美的闺蜜居然是个男人？？绝交多年后，她又不得已成为他的员工。冤家重逢，却让两人的距离在不知不觉中靠近，她会发现他的秘密吗？【独家/每周五更新或支付KK币抢先看 责编：珉xi 】","created_at":1493796322,"title":"窈窕淑男","update_status":"连载中","updated_at":1493796322,"id":1095,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170503/f13srbex0.webp-w180","grade":1,"nickname":"SEO WUHYUN","reg_type":"author","id":40145767},"label_id":11,"order":0,"comics_count":16},"shared_count":0,"id":25047,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#3750ff","cover_image_url":"http://f2.kkmh.com/image/170601/922ijuo9j.webp-w640","storyboard_cnt":33,"created_at":1496362766,"title":"第37话 自作多情","url":"http://www.kuaikanmanhua.com/comics/26204","likes_count":56534,"updated_at":1496314410,"selling_kk_currency":0,"comments_count":746,"label_text":"奇幻","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161222/ngyqi1u3t.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160819/ryx7eba08.webp-w640","update_day":"(每周五更新)","description":"催泪与奇幻交错的一场爱恋。冷漠孤僻的他，不惜耗费生命一次次穿越，只为守护冒冒失失的她，却说不出一句\u201c我爱你\u201d。他不知道的是，即使逐渐被人遗忘，她也会一直记得他······【独家/每周五更新，责编：33】","created_at":1471574479,"title":"时光守护人","update_status":"连载中","updated_at":1471574479,"id":908,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150422/qcw449bwr.jpg-w180","grade":1,"nickname":"雪梨","reg_type":"weibo","id":119649},"label_id":25,"order":0,"comics_count":38},"shared_count":0,"id":26204,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#6e68ff","cover_image_url":"http://f2.kkmh.com/image/170602/bciw1pula.webp-w640","storyboard_cnt":61,"created_at":1496362642,"title":"第17话  生死抉择","url":"http://www.kuaikanmanhua.com/comics/26416","likes_count":39909,"updated_at":1496371500,"selling_kk_currency":0,"comments_count":658,"label_text":"剧情","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170320/9odezufqv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170320/on3ece0hb.webp-w640","update_day":"(每周五更新)","description":"灾难题材漫画！倾城大雨，导致城市被淹。一夜之间，全城的鱼类竟然全部都异变成了吃人怪？在这场灾难中的幸存者生命岌岌可危，是否真的有人可以逃出这座城市？【独家/每周五更新 责编：M】","created_at":1488427482,"title":"鱼变","update_status":"连载中","updated_at":1488427482,"id":1045,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/170302/bwl5fuhcg.webp-w180","grade":1,"nickname":"小策君","reg_type":"author","id":36409899},"label_id":17,"order":0,"comics_count":18},"shared_count":0,"id":26416,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#7c5099","cover_image_url":"http://f2.kkmh.com/image/170601/gkngknju3.webp-w640","storyboard_cnt":29,"created_at":1496362520,"title":"第16想 牙医悚记","url":"http://www.kuaikanmanhua.com/comics/26185","likes_count":57430,"updated_at":1496302907,"selling_kk_currency":0,"comments_count":751,"label_text":"灵异","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170418/c9hkkh1v0.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170418/a32sthgz3.webp-w640","update_day":"(每周二、周五更新)","description":"日常生活中暗藏着一些细思极恐的事件！诸如地上的影子每天都会变化位置，古怪公司只招收女性，石头只落在某个人身上\u2026\u2026怪奇事件的真相等你来探究【独家/每周二、周五更新 责编：水原】","created_at":1492513383,"title":"奇悚妄想","update_status":"连载中","updated_at":1492513383,"id":1082,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170418/tcfpv1o67.webp-w180","grade":1,"nickname":"朝羽文化","reg_type":"author","id":39168986},"label_id":16,"order":0,"comics_count":16},"shared_count":0,"id":26185,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#3750ff","cover_image_url":"http://f2.kkmh.com/image/170601/39e32mssz.webp-w640","storyboard_cnt":30,"created_at":1496362161,"title":"第29话 究竟，你还有多少秘密？","url":"http://www.kuaikanmanhua.com/comics/26182","likes_count":44521,"updated_at":1496299473,"selling_kk_currency":0,"comments_count":409,"label_text":"奇幻","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"http://f2.kkmh.com/image/160401/96zi06das.webp-w750","vertical_image_url":"http://f2.kkmh.com/image/161212/7t5u4mda3.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160222/ncipy9zrk.webp-w640","update_day":"(双周更新)","description":"天降粘人狐仙攻，扑倒冷漠腹黑受。妖攻强行与人类小受同居，暗中保护时常被偷窥的他~慎入！【独家/双周四更新 责编：大树】","created_at":1455864849,"title":"这个狐仙不靠谱","update_status":"连载中","updated_at":1455864849,"id":728,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160219/cy1fu5ptq.webp-w180","grade":1,"nickname":"默小","reg_type":"author","id":8424157},"label_id":25,"order":400,"comics_count":31},"shared_count":0,"id":26182,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#7c5099","cover_image_url":"http://f2.kkmh.com/image/170602/7rjvksenx.webp-w640","storyboard_cnt":80,"created_at":1496362035,"title":"第4话 怪物悲惨的过去！","url":"http://www.kuaikanmanhua.com/comics/26277","likes_count":19037,"updated_at":1496368403,"selling_kk_currency":0,"comments_count":780,"label_text":"灵异","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170505/zaja53ork.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170505/s3hje8wlz.webp-w640","update_day":"(每周五更新)","description":"这是一个被诡异大雾笼罩的城市，怪物藏身雾中，就等倒霉鬼上钩。陈科便是这样的倒霉鬼，某天碰到了一个无眼无鼻的怪物！身为凡人该如何跟怪物搏命？！让人脊背发凉的恐怖故事即将展开【独家/每周五更新 责编：大树】","created_at":1493869482,"title":"山林怪谈","update_status":"连载中","updated_at":1493869482,"id":1096,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170503/etjbrdrjt.webp-w180","grade":1,"nickname":"山林界","reg_type":"author","id":40140212},"label_id":16,"order":0,"comics_count":5},"shared_count":0,"id":26277,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#5397d6","cover_image_url":"http://f2.kkmh.com/image/170601/5fczgmqm1.webp-w640","storyboard_cnt":78,"created_at":1496361914,"title":"寄生虫","url":"http://www.kuaikanmanhua.com/comics/26199","likes_count":95370,"updated_at":1496311260,"selling_kk_currency":0,"comments_count":1471,"label_text":"脑洞","zoomable":0,"is_free":true,"push_flag":0,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161212/bywdt3rar.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170122/zbyfi7n6d.webp-w640","update_day":"(每周五更新)","description":"短篇合集，讲述一场自来水污染导致人类出现的奇奇怪怪的疾病。细思极恐，高能慎入！看作者的脑洞能有多大！【授权/每周五更新 责编：拉面】","created_at":1453890436,"title":"自来水之污","update_status":"连载中","updated_at":1453890436,"id":699,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160530/744atwg2u.webp-w180","grade":1,"nickname":"潇潇潇潇如","reg_type":"author","id":6021212},"label_id":26,"order":0,"comics_count":75},"shared_count":0,"id":26199,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/ch5ep5hoq.webp-w640","storyboard_cnt":30,"created_at":1496361616,"title":"第59话 电话粥","url":"http://www.kuaikanmanhua.com/comics/26210","likes_count":44922,"updated_at":1496317600,"selling_kk_currency":0,"comments_count":1189,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/160309/akpbsaij7.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160309/x8vfai8rh.webp-w640","update_day":"(每周五更新)","description":"当你再度回忆起前任，你是会为没有结局的结局啜泣，还是会微笑着缅怀青涩稚嫩的自己？ \r\n\r\n【独家首发/每周五更新，责编：半石】","created_at":1457491294,"title":"我喜欢你，但不喜欢当时的自己（《41厘米的超幸福》系列）","update_status":"连载中","updated_at":1457491294,"id":752,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/dqhm6mw3z.jpg-w180","grade":1,"nickname":"C酱酱","reg_type":"weibo","id":17},"label_id":15,"order":300,"comics_count":50},"shared_count":0,"id":26210,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#b400fa","cover_image_url":"http://f2.kkmh.com/image/170601/3evrv24b2.webp-w640","storyboard_cnt":55,"created_at":1496361018,"title":"第10话 洁癖","url":"http://www.kuaikanmanhua.com/comics/26211","likes_count":39234,"updated_at":1496317615,"selling_kk_currency":0,"comments_count":324,"label_text":"都市","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170310/72c2oaw6m.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170310/sx0bdh6rh.webp-w640","update_day":"(每周五更新)","description":"根据知名作家蓝淋同名小说改编。肖腾醉酒后醒来发现自己床上竟躺着一个绝世美男！而这个家伙还整天黏着自己！躲不开的他是烂桃花，还是天意？【独家/双周五更新 责编：Uncle】","created_at":1489128936,"title":"意外事故","update_status":"连载中","updated_at":1489128936,"id":1049,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/160225/t7123h1hj.webp-w180","grade":1,"nickname":"蓝淋+吉祥茶（蜜读）","reg_type":"author","id":3181089},"label_id":11,"order":0,"comics_count":10},"shared_count":0,"id":26211,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#ff7300","cover_image_url":"http://f2.kkmh.com/image/170601/rl21uxbxf.webp-w640","storyboard_cnt":80,"created_at":1496360423,"title":"这是有味道的一话","url":"http://www.kuaikanmanhua.com/comics/26181","likes_count":34839,"updated_at":1496299285,"selling_kk_currency":0,"comments_count":536,"label_text":"爆笑","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/160325/7qw3ajsv3.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170122/gizjfq2o9.webp-w640","update_day":"(每周五更新)","description":"爆笑短篇集，森先生的神经日常。超强脑洞梗，入坑需谨慎！【 独家/每周五更新 责编：大树】","created_at":1419350984,"title":"叫我森先生","update_status":"连载中","updated_at":1419350984,"id":96,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/5pi7cks7s.jpg-w180","grade":1,"nickname":"森先生","reg_type":"weibo","id":109326},"label_id":5,"order":300,"comics_count":128},"shared_count":0,"id":26181,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#3750ff","cover_image_url":"http://f2.kkmh.com/image/170601/w18cjrwm3.webp-w640","storyboard_cnt":30,"created_at":1496358615,"title":"第21话 被栓在一起的美少年？","url":"http://www.kuaikanmanhua.com/comics/26195","likes_count":19603,"updated_at":1496309490,"selling_kk_currency":0,"comments_count":435,"label_text":"奇幻","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170122/pf3xy1omk.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170122/9usxzhljy.webp-w640","update_day":"(每周五更新)","description":"农村里的美男土地公只身闯入大城市，加入男团走上星途的他，能如愿站在舞台中央，成为最闪烁的那颗星吗？【授权/每周五更新 责编：珉xi 】","created_at":1485073123,"title":"我的男团我的神","update_status":"连载中","updated_at":1485073123,"id":1014,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170122/haspj22wi.webp-w180","grade":1,"nickname":"物语谁说","reg_type":"author","id":31244040},"label_id":25,"order":0,"comics_count":27},"shared_count":0,"id":26195,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#ff7300","cover_image_url":"http://f2.kkmh.com/image/170601/vswkr33lb.webp-w640","storyboard_cnt":30,"created_at":1496358322,"title":"第35话 主人你真的好可爱！","url":"http://www.kuaikanmanhua.com/comics/26192","likes_count":21493,"updated_at":1496307681,"selling_kk_currency":0,"comments_count":280,"label_text":"爆笑","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161221/gcki0dhqv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160926/loth20g0a.webp-w640","update_day":"(每周五更新)","description":"一夜之间，我的被子变成了男人！？可是偏偏还只有我才能看到！有苦难言的我要怎么办？这是一个暴躁女主和神秘被子男的爆笑故事！【独家/每周五更新  责编：珉xi 】","created_at":1474871905,"title":"别粘人！我的被子","update_status":"连载中","updated_at":1474871905,"id":937,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"Bu Bal","reg_type":"author","id":23470399},"label_id":5,"order":200,"comics_count":36},"shared_count":0,"id":26192,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false}],"timestamp":1496332800,"since":1496358322}
     * message : ok
     */


    private int code;
    private DataBean data;
    private String message;



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * comics : [{"info_type":0,"can_view":true,"label_color":"#be32ff","cover_image_url":"http://f2.kkmh.com/image/170601/zx427bu0r.webp-w640","storyboard_cnt":99,"created_at":1496367036,"title":"第53话 你想要的，我都会给你","url":"http://www.kuaikanmanhua.com/comics/26194","likes_count":216419,"updated_at":1496309237,"selling_kk_currency":0,"comments_count":4188,"label_text":"穿越","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161220/idr1o1juw.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160826/qq34tzx5q.webp-w640","update_day":"(每周五更新)","description":"古风类榜单总热度第一名！现代小萝莉家里从天而降了一个超帅的古代锦衣卫！缺失父母关怀的小萝莉把他当成了最亲近的人，竟要当他的童养媳？！表面傲娇冷漠挑剔的他，却越来越放不下这个小家伙...画风超级赞的养成系古风恋爱！\r\n【独家/每周五更新   责编：林早上】","created_at":1454327806,"title":"我男票是锦衣卫","update_status":"连载中","updated_at":1454327806,"id":709,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160201/rna6levqw.webp-w180","grade":1,"nickname":"ZQQ虹OR虹君 ","reg_type":"author","id":6835950},"label_id":18,"order":450,"comics_count":55},"shared_count":0,"id":26194,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/xfttlajpa.webp-w640","storyboard_cnt":60,"created_at":1496366432,"title":"第22话 心动与遇袭","url":"http://www.kuaikanmanhua.com/comics/26205","likes_count":183469,"updated_at":1496314651,"selling_kk_currency":0,"comments_count":2646,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161226/th1gzi9gn.webp-w320","cover_image_url":"http://f2.kkmh.com/image/161226/0nk746yec.webp-w640","update_day":"(每周四更新)","description":"武力值MAX的道场继承人\u2014\u2014向小满，为了追男神，决定江湖洗手，转校做一个安安静静的柔弱女子。而未曾想到的是，踏入校园第一天，男神还没追到，却因超凡的战斗力，被学校不良少年误认为男神。究竟小满能否成为男神心中的理想型，顺利转变现有的画风呢？【独家/每周四更新 责编：半石】","created_at":1482734574,"title":"当校霸爱上学霸","update_status":"连载中","updated_at":1482734574,"id":991,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/161226/qcezbh4i7.webp-w180","grade":1,"nickname":"灿灿 /夏天岛","reg_type":"author","id":28863310},"label_id":15,"order":400,"comics_count":25},"shared_count":0,"id":26205,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/129uxp01x.webp-w640","storyboard_cnt":33,"created_at":1496365833,"title":"第76话（下）你属于我","url":"http://www.kuaikanmanhua.com/comics/26209","likes_count":175346,"updated_at":1496317324,"selling_kk_currency":0,"comments_count":6609,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161220/6bti83qdn.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170105/ny470sr9w.webp-w640","update_day":"(每周一更新)","description":"恋爱类总榜热度第一名少女漫！当红人气鲜肉被曝毕业证做假仅考零分，回大学重修遇见贫穷土鳖学霸女，地位不对等的恋爱会有结果么？超强剧情，快来体验最心动，最浪漫，最苏最撩的爱情！！\r\n【独家/每周一更新  责编：33 】\r\n","created_at":1436162270,"title":"零分偶像","update_status":"连载中","updated_at":1436162270,"id":363,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150706/49kpat7nq.jpg-w180","grade":1,"nickname":"青庭","reg_type":"author","id":459327},"label_id":15,"order":600,"comics_count":89},"shared_count":0,"id":26209,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#44e36e","cover_image_url":"http://f2.kkmh.com/image/170526/v5kms66yq.webp-w640","storyboard_cnt":90,"created_at":1496365555,"title":"第4话 所谓\u201c朋友\u201d","url":"http://www.kuaikanmanhua.com/comics/25849","likes_count":72313,"updated_at":1495612507,"selling_kk_currency":0,"comments_count":400,"label_text":"校园","zoomable":0,"is_free":true,"push_flag":0,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170506/16x2spnzk.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170506/qe8fsboha.webp-w640","update_day":"(每周六更新)","description":"尹泰民意外穿越到了被同学欺负而自杀的韩施源身上后，重返学校一雪前耻，却没想到在学校遇到了识破自己身份的童年好友闵佑真，自此两个人的羁绊再度展开。【独家/每周六更新或支付KK币抢先看 责编：Uncle】","created_at":1494084403,"title":"在那尽头","update_status":"连载中","updated_at":1494084403,"id":1100,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170506/ply18ouz9.webp-w180","grade":1,"nickname":"HARIBO","reg_type":"author","id":40397658},"label_id":44,"order":0,"comics_count":16},"shared_count":0,"id":25849,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/8f6143j9b.webp-w640","storyboard_cnt":40,"created_at":1496365230,"title":"第30话 我一直很在意你！","url":"http://www.kuaikanmanhua.com/comics/26176","likes_count":126925,"updated_at":1496287752,"selling_kk_currency":0,"comments_count":3097,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161214/e9k4pap5h.webp-w320","cover_image_url":"http://f2.kkmh.com/image/161214/rhwm57v5f.webp-w640","update_day":"(每周五更新)","description":"上线第一话空降周榜TOP1，让你脸红心跳的少女漫！舞台剧中扮演王子的青梅竹马，竟当众触碰了我的唇，那可是我保留多年的初吻啊！可是这柔软而温暖的触感，以及快要无法呼吸的感觉，是怎么回事？男主超会撩妹！少女们快到碗里来！【独家/每周五更新，责编：珉xi 】","created_at":1481708960,"title":"还有一秒吻上你","update_status":"连载中","updated_at":1481708960,"id":979,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/161214/ld1a5vxlc.webp-w180","grade":1,"nickname":"Sui Souda","reg_type":"author","id":28374759},"label_id":15,"order":400,"comics_count":31},"shared_count":0,"id":26176,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#6e68ff","cover_image_url":"http://f2.kkmh.com/image/170601/16wtbic49.webp-w640","storyboard_cnt":60,"created_at":1496364931,"title":"第50话 他的孩子","url":"http://www.kuaikanmanhua.com/comics/26175","likes_count":77966,"updated_at":1496286577,"selling_kk_currency":0,"comments_count":885,"label_text":"剧情","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"http://f2.kkmh.com/image/160625/ibeyq3xel.webp-w750","vertical_image_url":"http://f2.kkmh.com/image/161226/0fs1aoqkd.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160728/j0ult13jz.webp-w640","update_day":"(每周五更新)","description":"奇幻类总热度TOP3作品！史上脾气最冲最不讲理年纪最大的少女漫女主角，77岁还要闹离婚？！离婚大戏正要上演，老夫妻却意外重返17岁，以年轻的肉体开始了一段崭新的生活\u2026\u2026【独家/每周五更新 责编：半石】","created_at":1466662141,"title":"欧巴！我们离婚吧！","update_status":"连载中","updated_at":1466662141,"id":856,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/160623/av9exudlp.webp-w180","grade":1,"nickname":"BAE Go-eun/Daum Webtoon","reg_type":"author","id":15321685},"label_id":17,"order":550,"comics_count":51},"shared_count":0,"id":26175,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#b400fa","cover_image_url":"http://f2.kkmh.com/image/170531/p5cqrz1vv.webp-w640","storyboard_cnt":65,"created_at":1496364569,"title":"第四季 第10话 女孩们","url":"http://www.kuaikanmanhua.com/comics/26133","likes_count":51968,"updated_at":1496201982,"selling_kk_currency":0,"comments_count":650,"label_text":"都市","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161212/50jz03pjz.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170105/2e8cr7uxu.webp-w640","update_day":"(每周五更新)","description":"根据顶级援交女的真实事件改编。姐姐为抚养妹妹踏入风尘，不幸卷入权利道德的旋涡丧生，妹妹决定进入这个黑暗世界，寻找真相。这部激情而不色情的漫画，深度剖析人性，揭露社会阴暗角落里为生存身不由己的群体。你愿意做正直的便宜货，还是高贵的垃圾？寻找震撼心灵有深度漫画的读者，不要错过！！\r\n【独家/每周五更新  责编：Uncle】","created_at":1453363785,"title":"头牌名媛","update_status":"连载中","updated_at":1453363785,"id":693,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170314/wxl2mav9u.webp-w180","grade":1,"nickname":"韩东圩+尹仁完+秉秀氏","reg_type":"author","id":37027243},"label_id":11,"order":500,"comics_count":75},"shared_count":0,"id":26133,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/44749qwwi.webp-w640","storyboard_cnt":33,"created_at":1496364024,"title":"第80话 突然的温暖","url":"http://www.kuaikanmanhua.com/comics/26207","likes_count":114823,"updated_at":1496316135,"selling_kk_currency":0,"comments_count":1543,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170110/wnsosvdxv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170110/0s3makjzb.webp-w640","update_day":"","description":"她是一直被误认为男生的黑道少女，他是同为黑道世家的纯良少爷。十年后，\u201c假小子\u201d变成冷酷无情的大姐头，他们会以怎样的方式重遇？怀着绅士之心点开，你一定以为这是个H漫\u2026\u2026【独家/每周五更新  责编:33】","created_at":1451473729,"title":"论不良少女调教方式","update_status":"连载中","updated_at":1451473729,"id":667,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/151230/vbjktjyq3.webp-w180","grade":1,"nickname":"梁赫文","reg_type":"author","id":5575228},"label_id":15,"order":200,"comics_count":81},"shared_count":0,"id":26207,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#b400fa","cover_image_url":"http://f2.kkmh.com/image/170601/58f8m7cug.webp-w640","storyboard_cnt":30,"created_at":1496363368,"title":"第6话 难道我们要24小时呆在一起？","url":"http://www.kuaikanmanhua.com/comics/25047","likes_count":51335,"updated_at":1493952744,"selling_kk_currency":0,"comments_count":414,"label_text":"都市","zoomable":0,"is_free":true,"push_flag":0,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170503/n73xgb1gd.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170503/9atjo7aie.webp-w640","update_day":"(每周五更新)","description":"高中时样样完美的闺蜜居然是个男人？？绝交多年后，她又不得已成为他的员工。冤家重逢，却让两人的距离在不知不觉中靠近，她会发现他的秘密吗？【独家/每周五更新或支付KK币抢先看 责编：珉xi 】","created_at":1493796322,"title":"窈窕淑男","update_status":"连载中","updated_at":1493796322,"id":1095,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170503/f13srbex0.webp-w180","grade":1,"nickname":"SEO WUHYUN","reg_type":"author","id":40145767},"label_id":11,"order":0,"comics_count":16},"shared_count":0,"id":25047,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#3750ff","cover_image_url":"http://f2.kkmh.com/image/170601/922ijuo9j.webp-w640","storyboard_cnt":33,"created_at":1496362766,"title":"第37话 自作多情","url":"http://www.kuaikanmanhua.com/comics/26204","likes_count":56534,"updated_at":1496314410,"selling_kk_currency":0,"comments_count":746,"label_text":"奇幻","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161222/ngyqi1u3t.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160819/ryx7eba08.webp-w640","update_day":"(每周五更新)","description":"催泪与奇幻交错的一场爱恋。冷漠孤僻的他，不惜耗费生命一次次穿越，只为守护冒冒失失的她，却说不出一句\u201c我爱你\u201d。他不知道的是，即使逐渐被人遗忘，她也会一直记得他······【独家/每周五更新，责编：33】","created_at":1471574479,"title":"时光守护人","update_status":"连载中","updated_at":1471574479,"id":908,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150422/qcw449bwr.jpg-w180","grade":1,"nickname":"雪梨","reg_type":"weibo","id":119649},"label_id":25,"order":0,"comics_count":38},"shared_count":0,"id":26204,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#6e68ff","cover_image_url":"http://f2.kkmh.com/image/170602/bciw1pula.webp-w640","storyboard_cnt":61,"created_at":1496362642,"title":"第17话  生死抉择","url":"http://www.kuaikanmanhua.com/comics/26416","likes_count":39909,"updated_at":1496371500,"selling_kk_currency":0,"comments_count":658,"label_text":"剧情","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170320/9odezufqv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170320/on3ece0hb.webp-w640","update_day":"(每周五更新)","description":"灾难题材漫画！倾城大雨，导致城市被淹。一夜之间，全城的鱼类竟然全部都异变成了吃人怪？在这场灾难中的幸存者生命岌岌可危，是否真的有人可以逃出这座城市？【独家/每周五更新 责编：M】","created_at":1488427482,"title":"鱼变","update_status":"连载中","updated_at":1488427482,"id":1045,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/170302/bwl5fuhcg.webp-w180","grade":1,"nickname":"小策君","reg_type":"author","id":36409899},"label_id":17,"order":0,"comics_count":18},"shared_count":0,"id":26416,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#7c5099","cover_image_url":"http://f2.kkmh.com/image/170601/gkngknju3.webp-w640","storyboard_cnt":29,"created_at":1496362520,"title":"第16想 牙医悚记","url":"http://www.kuaikanmanhua.com/comics/26185","likes_count":57430,"updated_at":1496302907,"selling_kk_currency":0,"comments_count":751,"label_text":"灵异","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170418/c9hkkh1v0.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170418/a32sthgz3.webp-w640","update_day":"(每周二、周五更新)","description":"日常生活中暗藏着一些细思极恐的事件！诸如地上的影子每天都会变化位置，古怪公司只招收女性，石头只落在某个人身上\u2026\u2026怪奇事件的真相等你来探究【独家/每周二、周五更新 责编：水原】","created_at":1492513383,"title":"奇悚妄想","update_status":"连载中","updated_at":1492513383,"id":1082,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170418/tcfpv1o67.webp-w180","grade":1,"nickname":"朝羽文化","reg_type":"author","id":39168986},"label_id":16,"order":0,"comics_count":16},"shared_count":0,"id":26185,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#3750ff","cover_image_url":"http://f2.kkmh.com/image/170601/39e32mssz.webp-w640","storyboard_cnt":30,"created_at":1496362161,"title":"第29话 究竟，你还有多少秘密？","url":"http://www.kuaikanmanhua.com/comics/26182","likes_count":44521,"updated_at":1496299473,"selling_kk_currency":0,"comments_count":409,"label_text":"奇幻","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"http://f2.kkmh.com/image/160401/96zi06das.webp-w750","vertical_image_url":"http://f2.kkmh.com/image/161212/7t5u4mda3.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160222/ncipy9zrk.webp-w640","update_day":"(双周更新)","description":"天降粘人狐仙攻，扑倒冷漠腹黑受。妖攻强行与人类小受同居，暗中保护时常被偷窥的他~慎入！【独家/双周四更新 责编：大树】","created_at":1455864849,"title":"这个狐仙不靠谱","update_status":"连载中","updated_at":1455864849,"id":728,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160219/cy1fu5ptq.webp-w180","grade":1,"nickname":"默小","reg_type":"author","id":8424157},"label_id":25,"order":400,"comics_count":31},"shared_count":0,"id":26182,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#7c5099","cover_image_url":"http://f2.kkmh.com/image/170602/7rjvksenx.webp-w640","storyboard_cnt":80,"created_at":1496362035,"title":"第4话 怪物悲惨的过去！","url":"http://www.kuaikanmanhua.com/comics/26277","likes_count":19037,"updated_at":1496368403,"selling_kk_currency":0,"comments_count":780,"label_text":"灵异","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170505/zaja53ork.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170505/s3hje8wlz.webp-w640","update_day":"(每周五更新)","description":"这是一个被诡异大雾笼罩的城市，怪物藏身雾中，就等倒霉鬼上钩。陈科便是这样的倒霉鬼，某天碰到了一个无眼无鼻的怪物！身为凡人该如何跟怪物搏命？！让人脊背发凉的恐怖故事即将展开【独家/每周五更新 责编：大树】","created_at":1493869482,"title":"山林怪谈","update_status":"连载中","updated_at":1493869482,"id":1096,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170503/etjbrdrjt.webp-w180","grade":1,"nickname":"山林界","reg_type":"author","id":40140212},"label_id":16,"order":0,"comics_count":5},"shared_count":0,"id":26277,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#5397d6","cover_image_url":"http://f2.kkmh.com/image/170601/5fczgmqm1.webp-w640","storyboard_cnt":78,"created_at":1496361914,"title":"寄生虫","url":"http://www.kuaikanmanhua.com/comics/26199","likes_count":95370,"updated_at":1496311260,"selling_kk_currency":0,"comments_count":1471,"label_text":"脑洞","zoomable":0,"is_free":true,"push_flag":0,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161212/bywdt3rar.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170122/zbyfi7n6d.webp-w640","update_day":"(每周五更新)","description":"短篇合集，讲述一场自来水污染导致人类出现的奇奇怪怪的疾病。细思极恐，高能慎入！看作者的脑洞能有多大！【授权/每周五更新 责编：拉面】","created_at":1453890436,"title":"自来水之污","update_status":"连载中","updated_at":1453890436,"id":699,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160530/744atwg2u.webp-w180","grade":1,"nickname":"潇潇潇潇如","reg_type":"author","id":6021212},"label_id":26,"order":0,"comics_count":75},"shared_count":0,"id":26199,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#fa6499","cover_image_url":"http://f2.kkmh.com/image/170601/ch5ep5hoq.webp-w640","storyboard_cnt":30,"created_at":1496361616,"title":"第59话 电话粥","url":"http://www.kuaikanmanhua.com/comics/26210","likes_count":44922,"updated_at":1496317600,"selling_kk_currency":0,"comments_count":1189,"label_text":"恋爱","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/160309/akpbsaij7.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160309/x8vfai8rh.webp-w640","update_day":"(每周五更新)","description":"当你再度回忆起前任，你是会为没有结局的结局啜泣，还是会微笑着缅怀青涩稚嫩的自己？ \r\n\r\n【独家首发/每周五更新，责编：半石】","created_at":1457491294,"title":"我喜欢你，但不喜欢当时的自己（《41厘米的超幸福》系列）","update_status":"连载中","updated_at":1457491294,"id":752,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/dqhm6mw3z.jpg-w180","grade":1,"nickname":"C酱酱","reg_type":"weibo","id":17},"label_id":15,"order":300,"comics_count":50},"shared_count":0,"id":26210,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#b400fa","cover_image_url":"http://f2.kkmh.com/image/170601/3evrv24b2.webp-w640","storyboard_cnt":55,"created_at":1496361018,"title":"第10话 洁癖","url":"http://www.kuaikanmanhua.com/comics/26211","likes_count":39234,"updated_at":1496317615,"selling_kk_currency":0,"comments_count":324,"label_text":"都市","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170310/72c2oaw6m.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170310/sx0bdh6rh.webp-w640","update_day":"(每周五更新)","description":"根据知名作家蓝淋同名小说改编。肖腾醉酒后醒来发现自己床上竟躺着一个绝世美男！而这个家伙还整天黏着自己！躲不开的他是烂桃花，还是天意？【独家/双周五更新 责编：Uncle】","created_at":1489128936,"title":"意外事故","update_status":"连载中","updated_at":1489128936,"id":1049,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/160225/t7123h1hj.webp-w180","grade":1,"nickname":"蓝淋+吉祥茶（蜜读）","reg_type":"author","id":3181089},"label_id":11,"order":0,"comics_count":10},"shared_count":0,"id":26211,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#ff7300","cover_image_url":"http://f2.kkmh.com/image/170601/rl21uxbxf.webp-w640","storyboard_cnt":80,"created_at":1496360423,"title":"这是有味道的一话","url":"http://www.kuaikanmanhua.com/comics/26181","likes_count":34839,"updated_at":1496299285,"selling_kk_currency":0,"comments_count":536,"label_text":"爆笑","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/160325/7qw3ajsv3.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170122/gizjfq2o9.webp-w640","update_day":"(每周五更新)","description":"爆笑短篇集，森先生的神经日常。超强脑洞梗，入坑需谨慎！【 独家/每周五更新 责编：大树】","created_at":1419350984,"title":"叫我森先生","update_status":"连载中","updated_at":1419350984,"id":96,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/150421/5pi7cks7s.jpg-w180","grade":1,"nickname":"森先生","reg_type":"weibo","id":109326},"label_id":5,"order":300,"comics_count":128},"shared_count":0,"id":26181,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#3750ff","cover_image_url":"http://f2.kkmh.com/image/170601/w18cjrwm3.webp-w640","storyboard_cnt":30,"created_at":1496358615,"title":"第21话 被栓在一起的美少年？","url":"http://www.kuaikanmanhua.com/comics/26195","likes_count":19603,"updated_at":1496309490,"selling_kk_currency":0,"comments_count":435,"label_text":"奇幻","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/170122/pf3xy1omk.webp-w320","cover_image_url":"http://f2.kkmh.com/image/170122/9usxzhljy.webp-w640","update_day":"(每周五更新)","description":"农村里的美男土地公只身闯入大城市，加入男团走上星途的他，能如愿站在舞台中央，成为最闪烁的那颗星吗？【授权/每周五更新 责编：珉xi 】","created_at":1485073123,"title":"我的男团我的神","update_status":"连载中","updated_at":1485073123,"id":1014,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/image/170122/haspj22wi.webp-w180","grade":1,"nickname":"物语谁说","reg_type":"author","id":31244040},"label_id":25,"order":0,"comics_count":27},"shared_count":0,"id":26195,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false},{"info_type":0,"can_view":true,"label_color":"#ff7300","cover_image_url":"http://f2.kkmh.com/image/170601/vswkr33lb.webp-w640","storyboard_cnt":30,"created_at":1496358322,"title":"第35话 主人你真的好可爱！","url":"http://www.kuaikanmanhua.com/comics/26192","likes_count":21493,"updated_at":1496307681,"selling_kk_currency":0,"comments_count":280,"label_text":"爆笑","zoomable":0,"is_free":true,"push_flag":1,"topic":{"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161221/gcki0dhqv.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160926/loth20g0a.webp-w640","update_day":"(每周五更新)","description":"一夜之间，我的被子变成了男人！？可是偏偏还只有我才能看到！有苦难言的我要怎么办？这是一个暴躁女主和神秘被子男的爆笑故事！【独家/每周五更新  责编：珉xi 】","created_at":1474871905,"title":"别粘人！我的被子","update_status":"连载中","updated_at":1474871905,"id":937,"user":{"pub_feed":0,"avatar_url":"http://f2.kkmh.com/default_avatar_image.jpg-w180","grade":1,"nickname":"Bu Bal","reg_type":"author","id":23470399},"label_id":5,"order":200,"comics_count":36},"shared_count":0,"id":26192,"label_text_color":"#ffffff","serial_no":0,"status":"published","is_liked":false}]
         * timestamp : 1496332800
         * since : 1496358322
         */

        private int timestamp;
        private int since;
        private List<ComicsBean> comics;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public int getSince() {
            return since;
        }

        public void setSince(int since) {
            this.since = since;
        }

        public List<ComicsBean> getComics() {
            return comics;
        }

        public void setComics(List<ComicsBean> comics) {
            this.comics = comics;
        }

        public static class ComicsBean {
            /**
             * info_type : 0
             * can_view : true
             * label_color : #be32ff
             * cover_image_url : http://f2.kkmh.com/image/170601/zx427bu0r.webp-w640
             * storyboard_cnt : 99
             * created_at : 1496367036
             * title : 第53话 你想要的，我都会给你
             * url : http://www.kuaikanmanhua.com/comics/26194
             * likes_count : 216419
             * updated_at : 1496309237
             * selling_kk_currency : 0
             * comments_count : 4188
             * label_text : 穿越
             * zoomable : 0
             * is_free : true
             * push_flag : 1
             * topic : {"discover_image_url":"","vertical_image_url":"http://f2.kkmh.com/image/161220/idr1o1juw.webp-w320","cover_image_url":"http://f2.kkmh.com/image/160826/qq34tzx5q.webp-w640","update_day":"(每周五更新)","description":"古风类榜单总热度第一名！现代小萝莉家里从天而降了一个超帅的古代锦衣卫！缺失父母关怀的小萝莉把他当成了最亲近的人，竟要当他的童养媳？！表面傲娇冷漠挑剔的他，却越来越放不下这个小家伙...画风超级赞的养成系古风恋爱！\r\n【独家/每周五更新   责编：林早上】","created_at":1454327806,"title":"我男票是锦衣卫","update_status":"连载中","updated_at":1454327806,"id":709,"user":{"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160201/rna6levqw.webp-w180","grade":1,"nickname":"ZQQ虹OR虹君 ","reg_type":"author","id":6835950},"label_id":18,"order":450,"comics_count":55}
             * shared_count : 0
             * id : 26194
             * label_text_color : #ffffff
             * serial_no : 0
             * status : published
             * is_liked : false
             */

            private int info_type;
            private boolean can_view;
            private String label_color;
            private String cover_image_url;
            private int storyboard_cnt;
            private int created_at;
            private String title;
            private String url;
            private int likes_count;
            private int updated_at;
            private int selling_kk_currency;
            private int comments_count;
            private String label_text;
            private int zoomable;
            private boolean is_free;
            private int push_flag;
            private TopicBean topic;
            private int shared_count;
            private int id;
            private String label_text_color;
            private int serial_no;
            private String status;
            private boolean is_liked;

            public int getInfo_type() {
                return info_type;
            }

            public void setInfo_type(int info_type) {
                this.info_type = info_type;
            }

            public boolean isCan_view() {
                return can_view;
            }

            public void setCan_view(boolean can_view) {
                this.can_view = can_view;
            }

            public String getLabel_color() {
                return label_color;
            }

            public void setLabel_color(String label_color) {
                this.label_color = label_color;
            }

            public String getCover_image_url() {
                return cover_image_url;
            }

            public void setCover_image_url(String cover_image_url) {
                this.cover_image_url = cover_image_url;
            }

            public int getStoryboard_cnt() {
                return storyboard_cnt;
            }

            public void setStoryboard_cnt(int storyboard_cnt) {
                this.storyboard_cnt = storyboard_cnt;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public int getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(int updated_at) {
                this.updated_at = updated_at;
            }

            public int getSelling_kk_currency() {
                return selling_kk_currency;
            }

            public void setSelling_kk_currency(int selling_kk_currency) {
                this.selling_kk_currency = selling_kk_currency;
            }

            public int getComments_count() {
                return comments_count;
            }

            public void setComments_count(int comments_count) {
                this.comments_count = comments_count;
            }

            public String getLabel_text() {
                return label_text;
            }

            public void setLabel_text(String label_text) {
                this.label_text = label_text;
            }

            public int getZoomable() {
                return zoomable;
            }

            public void setZoomable(int zoomable) {
                this.zoomable = zoomable;
            }

            public boolean isIs_free() {
                return is_free;
            }

            public void setIs_free(boolean is_free) {
                this.is_free = is_free;
            }

            public int getPush_flag() {
                return push_flag;
            }

            public void setPush_flag(int push_flag) {
                this.push_flag = push_flag;
            }

            public TopicBean getTopic() {
                return topic;
            }

            public void setTopic(TopicBean topic) {
                this.topic = topic;
            }

            public int getShared_count() {
                return shared_count;
            }

            public void setShared_count(int shared_count) {
                this.shared_count = shared_count;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLabel_text_color() {
                return label_text_color;
            }

            public void setLabel_text_color(String label_text_color) {
                this.label_text_color = label_text_color;
            }

            public int getSerial_no() {
                return serial_no;
            }

            public void setSerial_no(int serial_no) {
                this.serial_no = serial_no;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public boolean isIs_liked() {
                return is_liked;
            }

            public void setIs_liked(boolean is_liked) {
                this.is_liked = is_liked;
            }

            public static class TopicBean {
                /**
                 * discover_image_url :
                 * vertical_image_url : http://f2.kkmh.com/image/161220/idr1o1juw.webp-w320
                 * cover_image_url : http://f2.kkmh.com/image/160826/qq34tzx5q.webp-w640
                 * update_day : (每周五更新)
                 * description : 古风类榜单总热度第一名！现代小萝莉家里从天而降了一个超帅的古代锦衣卫！缺失父母关怀的小萝莉把他当成了最亲近的人，竟要当他的童养媳？！表面傲娇冷漠挑剔的他，却越来越放不下这个小家伙...画风超级赞的养成系古风恋爱！
                 【独家/每周五更新   责编：林早上】
                 * created_at : 1454327806
                 * title : 我男票是锦衣卫
                 * update_status : 连载中
                 * updated_at : 1454327806
                 * id : 709
                 * user : {"pub_feed":1,"avatar_url":"http://f2.kkmh.com/image/160201/rna6levqw.webp-w180","grade":1,"nickname":"ZQQ虹OR虹君 ","reg_type":"author","id":6835950}
                 * label_id : 18
                 * order : 450
                 * comics_count : 55
                 */

                private String discover_image_url;
                private String vertical_image_url;
                private String cover_image_url;
                private String update_day;
                private String description;
                private int created_at;
                private String title;
                private String update_status;
                private int updated_at;
                private int id;
                private UserBean user;
                private int label_id;
                private int order;
                private int comics_count;

                public String getDiscover_image_url() {
                    return discover_image_url;
                }

                public void setDiscover_image_url(String discover_image_url) {
                    this.discover_image_url = discover_image_url;
                }

                public String getVertical_image_url() {
                    return vertical_image_url;
                }

                public void setVertical_image_url(String vertical_image_url) {
                    this.vertical_image_url = vertical_image_url;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public String getUpdate_day() {
                    return update_day;
                }

                public void setUpdate_day(String update_day) {
                    this.update_day = update_day;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUpdate_status() {
                    return update_status;
                }

                public void setUpdate_status(String update_status) {
                    this.update_status = update_status;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public UserBean getUser() {
                    return user;
                }

                public void setUser(UserBean user) {
                    this.user = user;
                }

                public int getLabel_id() {
                    return label_id;
                }

                public void setLabel_id(int label_id) {
                    this.label_id = label_id;
                }

                public int getOrder() {
                    return order;
                }

                public void setOrder(int order) {
                    this.order = order;
                }

                public int getComics_count() {
                    return comics_count;
                }

                public void setComics_count(int comics_count) {
                    this.comics_count = comics_count;
                }

                public static class UserBean {
                    /**
                     * pub_feed : 1
                     * avatar_url : http://f2.kkmh.com/image/160201/rna6levqw.webp-w180
                     * grade : 1
                     * nickname : ZQQ虹OR虹君
                     * reg_type : author
                     * id : 6835950
                     */

                    private int pub_feed;
                    private String avatar_url;
                    private int grade;
                    private String nickname;
                    private String reg_type;
                    private int id;

                    public int getPub_feed() {
                        return pub_feed;
                    }

                    public void setPub_feed(int pub_feed) {
                        this.pub_feed = pub_feed;
                    }

                    public String getAvatar_url() {
                        return avatar_url;
                    }

                    public void setAvatar_url(String avatar_url) {
                        this.avatar_url = avatar_url;
                    }

                    public int getGrade() {
                        return grade;
                    }

                    public void setGrade(int grade) {
                        this.grade = grade;
                    }

                    public String getNickname() {
                        return nickname;
                    }

                    public void setNickname(String nickname) {
                        this.nickname = nickname;
                    }

                    public String getReg_type() {
                        return reg_type;
                    }

                    public void setReg_type(String reg_type) {
                        this.reg_type = reg_type;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }
                }
            }
        }
    }
}
