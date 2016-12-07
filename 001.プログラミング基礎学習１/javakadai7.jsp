<%	
	String sougaku = request.getParameter("param1");//4000が入ります
	String kosuu = request.getParameter("param2");//16が入ります
	String syurui = request.getParameter("param3");//3が入ります

	//課題7-1
	out.println("1:雑貨　2:生鮮食品　3:その他");
	out.println("こちらの商品は"+syurui+"の項目です");

	//課題7-2
	int i = 0;//一つ当たりの値段
	i = 4000 / 16;
	out.print("総額="+sougaku+"一つ当たり="+i+"です。");
	//課題7-3
	int goukei = 4000;//購入合計
	int point = 0;//買い物ポイント
	if(goukei >= 5000){
		point = goukei * 5 / 100;
	} else if(goukei  >= 3000){
		point = goukei * 4 / 100;
	}
	out.print(point+"ポイントが加算されました。");

%>