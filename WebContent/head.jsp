<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="utf-8">
	    <title>DesignPortfolio</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="">
	    <meta name="author" content="">

	    <!-- Styles -->
	    <link href='http://fonts.useso.com/css?family=Open+Sans:400,700' rel='stylesheet' >
	    <link href="css/bootstrap.css" rel="stylesheet">
	    <link href="css/responsive.bootstrap.css" rel="stylesheet">
	    <link href="css/screen.css" rel="stylesheet">

	    <!--[if lt IE 9]>
	      <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
	    <![endif]-->

	    <!-- Faviocon and touch -->
	    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="#">
	    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="#">
	      <link rel="apple-touch-icon-precomposed" sizes="72x72" href="#">
	                    <link rel="apple-touch-icon-precomposed" href="#">
	                                   <link rel="shortcut icon" href="img/favicon/favicon.ico">
	</head>
	<body>
	
		<!-- START SETTINGS BOX -->
	<div class="customPanel customPanelClosed">
	  <div class="customPanelOptions">
	    Site Color<br />
	    <div class="customPanelOptionsPickerButton customPanelOptionsPickerButtonSite"></div>
	    <div style="clear:both;"></div>
	  </div>
	  <div class="customPanelOptionsPicker customPanelOptionsPickerBackground"></div>
	  <div class="customPanelOptionsPicker customPanelOptionsPickerSite"></div>
	  <div class="customPanelButton"></div>
	</div>
	<!-- END SETTINGS BOX --> 


		<header>
			<div class="navTop">
				<div class="container">
					<div class="row">
						<nav class="span12">
							<ul class="clearfix unstyled pull-right">
								<li>
									<a href="#" title="twitter">Twitter</a>
								</li>
								<li>
									<a href="#" title="Flckr">Flckr</a>
								</li>
								<li>
									<a href="#" title="Facebook">Facebook</a>
								</li>
								<li>
									<a href="#" title="Google+">Google+</a>
								</li>
							</ul>
						</nav><!-- /nav -->
					</div><!-- /.row [TopNavigation] -->
				</div><!-- /.container -->
			</div><!-- /.navTop -->

			<div class="mainNav">
				<div class="container">
					<div class="row">
						<nav class="span8 clearfix navbar-inner">
							<a class="btn btn-color menuMobile" data-toggle="collapse" data-target=".nav-collapse">menu</a>
						    <div class="nav-collapse collapse">
								<ul class="nav inline pull-right menu">
									>
									<li>
										<a href="goodsTypeManage.jsp">商品类别管理</a>
										
									</li>
									<li>
										<a href="goodsManage.jsp">商品管理</a>
										
									</li>
									<li>
										<a href="importManage.jsp">商品入库管理</a>
										
									</li>
                                    <li>
										<a href="exportManage.jsp">商品出库管理</a>
										
									</li>
                                    <li>
										<a href="stockManage.jsp">商品库存管理</a>
										
									</li>
									<li>
										<a href="providerManage.jsp">供应商管理</a>
										
									</li>
									<li>
										<a href="stockManageSystem/login!logOut">注销</a>
										
									</li>
								</ul>
								
							</div>
						</nav><!-- /nav.span6 [MainNavigation] -->
						
			  
						</div>
					</div><!-- /.row [Logo, MainNavigation] -->
				</div><!-- /.container -->
			</div><!-- /.mainNav -->
		</header><!-- /header -->
		

	
	</body>
</html> 