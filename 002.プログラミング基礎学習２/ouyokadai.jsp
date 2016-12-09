<%	String num=request.getParameter("param1");//
	int A = Integer.parseInt(num);

	out.println("元の数字 "+A);
	out.print("素因数");
	

	if(A%2==0){
			A/= 2;
		    out.print("2");
	}else if(A%3==0){
			A/= 3;
		    out.print("3");
			
	}else if(A%5==0){
			A/= 5;
		    out.print("5");		
	}else if(A%7==0){
			A/= 7;
		    out.print("7");
	}else if(A%9==0){
			A/= 9;
		    out.print("9");
	}else{
		    out.print(" なし");
	}

	while(A>1){
		if(A%2==0){
			A/= 2;
		    out.print("x2");
		}else if(A%3==0){
			A/= 3;
		    out.print("x3");
			
		}else if(A%5==0){
			A/= 5;
		    out.print("x5");		
		}else if(A%7==0){
			A/= 7;
		    out.print("x7");
		}else if(A%9==0){
			A/= 9;
		    out.print("x9");
		}else{
			break;
		}
	}
	if(A!=1){
	out.println();
	out.print("その他 "+A);
	}
%>