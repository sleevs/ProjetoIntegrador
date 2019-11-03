<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="icon" href="image/favicon.png" type="image/png">
<title>Consultar Solicitação de Reembolso</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="vendors/linericon/style.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
<link rel="stylesheet"
	href="vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="vendors/nice-select/css/nice-select.css">
<link rel="stylesheet" href="vendors/owl-carousel/owl.carousel.min.css">
<!-- main css -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/responsive.css">
</head>
<body>
	<!--================Header Area =================-->
	<header class="header_area">
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-light">
				<!-- Brand and toggle get grouped for better mobile display -->
				<a class="navbar-brand logo_h" href="index.jsp">Solicitação de Reembolso</a>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse offset"
					id="navbarSupportedContent">
					<ul class="nav navbar-nav menu_nav ml-auto">
						<li class="nav-item active"><a class="nav-link"
							href="index.jsp">Formulário</a></li>
							
						<li class="nav-item"><a class="nav-link" href="consulta.jsp">Consulta</a></li>
					</ul>
				</div>
			</nav>
		</div>
	</header>
	<!--================Header Area =================-->

	<!--================Banner Area =================-->
	<section class="banner_area">
		<div class="booking_table d_flex align-items-center">
			<div class="overlay bg-parallax" data-stellar-ratio="0.9"
				data-stellar-vertical-offset="0" data-background=""></div>
			<div class="container">
	
				<div class="banner_content text-center">
					<div class="banner_content text-center">
						<br>
						<div class="container">
							<div class="hotel_booking_table">
								<h2>Consultar Solicitação de Reembolso</h2>

							</div>

							<div class="hotel_booking_table">
                             <form method="post" action="ReembolsoControle">
						
												<div class="book_tabel_item">

													<div class="form-group">
													
														<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name=matricula placeholder="Matrícula"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Matrícula '"
																required="Y" type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="nome" placeholder="Nome"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Nome '"
																required="Y" type="text" class="form-control">
														</div>
														
													</div>
															<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="endereco" placeholder="Endereço"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Endereço '"
																required="Y" type="text" class="form-control">
														</div>
													</div>
													</div>
															<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="telefone" placeholder="Telefone"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Telefone '"
																required="Y" type="text" class="form-control">
														</div>
													</div>
													
													<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="email" placeholder="Email"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Email '"
																required="Y" type="text" class="form-control">
														</div>
													</div>
														<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="motivo" placeholder="Descreva o Motivo"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Descreva o Motivo '"
																required="Y" type="text" class="form-control">
														</div>
													</div>
							<!--
														<div class="input-group d-flex flex-row">
															<input name="matricula" placeholder="NÃºmero da ApÃ³lice"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'NÃºmero da ApÃ³lice '"
																required="Y" type="text" class="form-control"
																onkeypress="return event.charCode >= 48 && event.charCode <= 57"
																title="Isira apenas nÃºmeros">
														</div>
												</div>

													

													<div class="form-group">
														<div class='input-group date' id='datetimepicker11'>
															<input name="nascimento" type='text' class="form-control"
																placeholder="Data de Nascimento" required /> <span
																class="input-group-addon"> <i
																class="fa fa-calendar" aria-hidden="true"></i>
															</span>
														</div>
													</div>


													<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="endereco" placeholder="EndereÃ§o"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'EndereÃ§o '" required=""
																type="text" class="form-control">
														</div>
													</div>
													<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="motivo" placeholder="Descreva o motivo"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'EndereÃ§o '" required=""
																type="text" class="form-control">
														</div>
													</div>
												</div>
											</div>
											<div class="col-md-4">
												<div class="book_tabel_item">

													<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="telefone" placeholder="Telefone"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Telefone '" required
																type="text" class="form-control" title="(DD) XXXXX-XXXX"
																minlength="10" maxlength="14" onKeyUp="phone(this)">
														</div>
													</div>

													<div class="form-group">
														<div class="input-group d-flex flex-row">
															<input name="email" placeholder="Email"
																onfocus="this.placeholder = ''"
																onblur="this.placeholder = 'Email '" required
																type="text" class="form-control">
														</div>
													</div>

												</div>
											</div>
											<div class="col-md-4">
												<h3>Dados do Paciente (Caso este nÃ£o seja o titular da
													apÃ³lice)</h3>
											</div>
										</div>
									</div>
								</div>
								<div class="col-md-3">
									<div class="book_tabel_item">


										<div class="input-group">
											<select name="genero" type="text" class="wide">
												<option data-display="Sexo">Sexo</option>
												<option value="1">Masculino</option>
												<option value="2">Feminino</option>
											</select>
										</div>
								
									 -->
							
										<%
                                                    
                                                    String r = "";
                                                   // ReembolsoBusiness reembolsoBusiness = new ReembolsoBusiness();
                                                  //onclick="validacaoEmail(document.getElementsByName('Email'))" 
                                                   //href="DadosPagamento.html"
                                                   %>
										<input class="book_now_btn button_hover"
											
											type="submit" value="Gerar Solicitação"/>
									</div>
								</div>
								</form>
							</div>
						</div>
					</div>

					<!--<a href="#" class="btn theme_btn button_hover">Get Started</a>-->
				</div>
			</div>
		</div>

	</section>

	<!--================ start footer Area  =================-->

	<!--================ End footer Area  =================-->


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/popper.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="vendors/owl-carousel/owl.carousel.min.js"></script>
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<script src="js/mail-script.js"></script>
	<script
		src="vendors/bootstrap-datepicker/bootstrap-datetimepicker.min.js"></script>
	<script src="vendors/nice-select/js/jquery.nice-select.js"></script>
	<script src="js/mail-script.js"></script>
	<script src="js/stellar.js"></script>
	<script src="vendors/lightbox/simpleLightbox.min.js"></script>
	<script src="js/custom.js"></script>
	<script src="js/camposReembolso.js"></script>
</body>
</html>