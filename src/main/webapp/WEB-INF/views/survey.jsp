<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<title>My HTML View</title>
</head>
<body>
	<input type="hidden" id="voucherCode" name="voucherCode" value="${param.val}"/>
	<button id="bt" type="button" class="btn btn-success">Success</button>
	<div id="surveyMonkeyInfo">
		<div>
			<script
				src="http://www.surveymonkey.com/jsEmbed.aspx?sm=SE6_2fdgP3ZEkDJe0QmzBHOw_3d_3d">
				
			</script>
		</div>
		Create your free online surveys with <a
			href="https://www.surveymonkey.com">SurveyMonkey</a> , the world's
		leading questionnaire tool.
	</div>
	<%-- <div class="success">
		<h3>foo: "${foo}"</h3>
		<h3>fruit: "${fruit}"</h3>
	</div> --%>
	<select id="selectField_1" class="SelectField">
		<option value="51" selected>option1</option>
		<option value="52">option2</option>
		<option value="53">option3</option>
		<option value="54">option4</option>
	</select>

	<select id="selectField_2" class="SelectField">
		<option value="55" selected>option1</option>
		<option value="56">option2</option>
		<option value="57">option3</option>
		<option value="58">option4</option>
	</select> ...................................

	<select id="selectField_n" class="SelectField">
		<option value="n" selected>option1</option>
		<option value="n">option2</option>
		<option value="n">option3</option>
		<option value="n">option4</option>
	</select>

	</br>

	<div id="51" class="box_1">Content 51</div>
	<div id="52" class="box_1">Content 52</div>
	<div id="53" class="box_1">Content 53</div>
	<div id="54" class="box_1">Content 54</div>

	<div id="55" class="box_2">Content 55</div>
	<div id="56" class="box_2">Content 56</div>
	<div id="57" class="box_2">Content 57</div>
	<div id="58" class="box_2">Content 58</div>



	................................................

	<div id="n" class="box_n">Content n</div>
	<div id="n" class="box_n">Content n</div>
	<div id="n" class="box_n">Content n</div>
	<div id="n" class="box_n">Content n</div>
</body>
</html>