



<!DOCTYPE html>
<html>
<head>
 <link rel="icon" type="image/vnd.microsoft.icon" href="https://ssl.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 
 
 
 var codesite_token = null;
 
 
 var CS_env = {"profileUrl":null,"token":null,"assetHostPath":"https://ssl.gstatic.com/codesite/ph","domainName":null,"assetVersionPath":"https://ssl.gstatic.com/codesite/ph/13841197563397998716","projectHomeUrl":"/p/dart","relativeBaseUrl":"","projectName":"dart","loggedInUserEmail":null};
 var _gaq = _gaq || [];
 _gaq.push(
 ['siteTracker._setAccount', 'UA-18071-1'],
 ['siteTracker._trackPageview']);
 
 _gaq.push(
 ['projectTracker._setAccount', 'UA-26150894-2'],
 ['projectTracker._trackPageview']);
 
 
 </script>
 
 
 <title>Spirodraw.dart - 
 dart -
 
 
 Dart - Structured Web Programming - Google Project Hosting
 </title>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
 <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" >
 
 <meta name="ROBOTS" content="NOARCHIVE">
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/13841197563397998716/css/core.css">
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/13841197563397998716/css/ph_detail.css" >
 
 
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/13841197563397998716/css/d_sb.css" >
 
 
 
<!--[if IE]>
 <link type="text/css" rel="stylesheet" href="https://ssl.gstatic.com/codesite/ph/13841197563397998716/css/d_ie.css" >
<![endif]-->
 <style type="text/css">
 .menuIcon.off { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -42px }
 .menuIcon.on { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 -28px }
 .menuIcon.down { background: no-repeat url(https://ssl.gstatic.com/codesite/ph/images/dropdown_sprite.gif) 0 0; }
 
 
 
  tr.inline_comment {
 background: #fff;
 vertical-align: top;
 }
 div.draft, div.published {
 padding: .3em;
 border: 1px solid #999; 
 margin-bottom: .1em;
 font-family: arial, sans-serif;
 max-width: 60em;
 }
 div.draft {
 background: #ffa;
 } 
 div.published {
 background: #e5ecf9;
 }
 div.published .body, div.draft .body {
 padding: .5em .1em .1em .1em;
 max-width: 60em;
 white-space: pre-wrap;
 white-space: -moz-pre-wrap;
 white-space: -pre-wrap;
 white-space: -o-pre-wrap;
 word-wrap: break-word;
 font-size: 1em;
 }
 div.draft .actions {
 margin-left: 1em;
 font-size: 90%;
 }
 div.draft form {
 padding: .5em .5em .5em 0;
 }
 div.draft textarea, div.published textarea {
 width: 95%;
 height: 10em;
 font-family: arial, sans-serif;
 margin-bottom: .5em;
 }

 
 .nocursor, .nocursor td, .cursor_hidden, .cursor_hidden td {
 background-color: white;
 height: 2px;
 }
 .cursor, .cursor td {
 background-color: darkblue;
 height: 2px;
 display: '';
 }
 
 
.list {
 border: 1px solid white;
 border-bottom: 0;
}

 
 </style>
</head>
<body class="t4">
<script type="text/javascript">
 (function() {
 var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
 ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
 (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(ga);
 })();
</script>
<div class="headbg">

 <div id="gaia">
 

 <span>
 
 <a href="#" id="projects-dropdown" onclick="return false;"><u>My favorites</u> <small>&#9660;</small></a>
 | <a href="https://www.google.com/accounts/ServiceLogin?service=code&amp;ltmpl=phosting&amp;continue=https%3A%2F%2Fcode.google.com%2Fp%2Fdart%2Fsource%2Fbrowse%2Fbranches%2Fbleeding_edge%2Fdart%2Fclient%2Fsamples%2Fspirodraw%2FSpirodraw.dart&amp;followup=https%3A%2F%2Fcode.google.com%2Fp%2Fdart%2Fsource%2Fbrowse%2Fbranches%2Fbleeding_edge%2Fdart%2Fclient%2Fsamples%2Fspirodraw%2FSpirodraw.dart" onclick="_CS_click('/gb/ph/signin');"><u>Sign in</u></a>
 
 </span>

 </div>

 <div class="gbh" style="left: 0pt;"></div>
 <div class="gbh" style="right: 0pt;"></div>
 
 
 <div style="height: 1px"></div>
<!--[if lte IE 7]>
<div style="text-align:center;">
Your version of Internet Explorer is not supported. Try a browser that
contributes to open source, such as <a href="http://www.firefox.com">Firefox</a>,
<a href="http://www.google.com/chrome">Google Chrome</a>, or
<a href="http://code.google.com/chrome/chromeframe/">Google Chrome Frame</a>.
</div>
<![endif]-->




 <table style="padding:0px; margin: 0px 0px 10px 0px; width:100%" cellpadding="0" cellspacing="0"
 itemscope itemtype="http://schema.org/CreativeWork">
 <tr style="height: 58px;">
 
 <td id="plogo">
 <link itemprop="url" href="/p/dart">
 <a href="/p/dart/">
 
 
 <img src="/p/dart/logo?cct=1318345571"
 alt="Logo" itemprop="image">
 
 </a>
 </td>
 
 <td style="padding-left: 0.5em">
 
 <div id="pname">
 <a href="/p/dart/"><span itemprop="name">dart</span></a>
 </div>
 
 <div id="psum">
 <a id="project_summary_link"
 href="/p/dart/"><span itemprop="description">Dart - Structured Web Programming</span></a>
 
 </div>
 
 
 </td>
 <td style="white-space:nowrap;text-align:right; vertical-align:bottom;">
 
 <form action="/hosting/search">
 <input size="30" name="q" value="" type="text">
 
 <input type="submit" name="projectsearch" value="Search projects" >
 </form>
 
 </tr>
 </table>

</div>

 
<div id="mt" class="gtb"> 
 <a href="/p/dart/" class="tab ">Project&nbsp;Home</a>
 
 
 
 
 
 
 <a href="/p/dart/w/list" class="tab ">Wiki</a>
 
 
 
 
 
 <a href="/p/dart/issues/list"
 class="tab ">Issues</a>
 
 
 
 
 
 <a href="/p/dart/wiki/GettingTheSource?tm=4"
 class="tab active">Source</a>
 
 
 
 
 
 <div class=gtbc></div>
</div>
<table cellspacing="0" cellpadding="0" width="100%" align="center" border="0" class="st">
 <tr>
 
 
 
 
 
 
 <td class="subt">
 <div class="st2">
 <div class="isf">
 
 


 <span class="inst1"><a href="/p/dart/source/checkout">Checkout</a></span> &nbsp;
 <span class="inst2"><a href="/p/dart/source/browse/">Browse</a></span> &nbsp;
 <span class="inst3"><a href="/p/dart/source/list">Changes</a></span> &nbsp;
 
 <form action="http://www.google.com/codesearch" method="get" style="display:inline"
 onsubmit="document.getElementById('codesearchq').value = document.getElementById('origq').value + ' package:http://dart\\.googlecode\\.com'">
 <input type="hidden" name="q" id="codesearchq" value="">
 <input type="text" maxlength="2048" size="38" id="origq" name="origq" value="" title="Google Code Search" style="font-size:92%">&nbsp;<input type="submit" value="Search Trunk" name="btnG" style="font-size:92%">
 
 </form>
 </div>
</div>

 </td>
 
 
 
 <td align="right" valign="top" class="bevel-right"></td>
 </tr>
</table>


<script type="text/javascript">
 var cancelBubble = false;
 function _go(url) { document.location = url; }
</script>
<div id="maincol"
 
>

 
<!-- IE -->




<div class="expand">
<div id="colcontrol">
<style type="text/css">
 #file_flipper { white-space: nowrap; padding-right: 2em; }
 #file_flipper.hidden { display: none; }
 #file_flipper .pagelink { color: #0000CC; text-decoration: underline; }
 #file_flipper #visiblefiles { padding-left: 0.5em; padding-right: 0.5em; }
</style>
<table id="nav_and_rev" class="list"
 cellpadding="0" cellspacing="0" width="100%">
 <tr>
 
 <td nowrap="nowrap" class="src_crumbs src_nav" width="33%">
 <strong class="src_nav">Source path:&nbsp;</strong>
 <span id="crumb_root">
 
 <a href="/p/dart/source/browse/">svn</a>/&nbsp;</span>
 <span id="crumb_links" class="ifClosed"><a href="/p/dart/source/browse/branches/">branches</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/">bleeding_edge</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/">dart</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/">client</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/">samples</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/">spirodraw</a><span class="sp">/&nbsp;</span>Spirodraw.dart</span>
 
 

 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper">
 <ul class="leftside">
 
 <li><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart?r=149" title="Previous">&lsaquo;r149</a></li>
 
 </ul>
 </td>
 
 <td class="flipper"><b>r352</b></td>
 
 </tr></table>
 </td> 
 </tr>
</table>

<div class="fc">
 
 
 
<style type="text/css">
.undermouse span {
 background-image: url(https://ssl.gstatic.com/codesite/ph/images/comments.gif); }
</style>
<table class="opened" id="review_comment_area"
><tr>
<td id="nums">
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
<pre><table width="100%" id="nums_table_0"><tr id="gr_svn352_1"

><td id="1"><a href="#1">1</a></td></tr
><tr id="gr_svn352_2"

><td id="2"><a href="#2">2</a></td></tr
><tr id="gr_svn352_3"

><td id="3"><a href="#3">3</a></td></tr
><tr id="gr_svn352_4"

><td id="4"><a href="#4">4</a></td></tr
><tr id="gr_svn352_5"

><td id="5"><a href="#5">5</a></td></tr
><tr id="gr_svn352_6"

><td id="6"><a href="#6">6</a></td></tr
><tr id="gr_svn352_7"

><td id="7"><a href="#7">7</a></td></tr
><tr id="gr_svn352_8"

><td id="8"><a href="#8">8</a></td></tr
><tr id="gr_svn352_9"

><td id="9"><a href="#9">9</a></td></tr
><tr id="gr_svn352_10"

><td id="10"><a href="#10">10</a></td></tr
><tr id="gr_svn352_11"

><td id="11"><a href="#11">11</a></td></tr
><tr id="gr_svn352_12"

><td id="12"><a href="#12">12</a></td></tr
><tr id="gr_svn352_13"

><td id="13"><a href="#13">13</a></td></tr
><tr id="gr_svn352_14"

><td id="14"><a href="#14">14</a></td></tr
><tr id="gr_svn352_15"

><td id="15"><a href="#15">15</a></td></tr
><tr id="gr_svn352_16"

><td id="16"><a href="#16">16</a></td></tr
><tr id="gr_svn352_17"

><td id="17"><a href="#17">17</a></td></tr
><tr id="gr_svn352_18"

><td id="18"><a href="#18">18</a></td></tr
><tr id="gr_svn352_19"

><td id="19"><a href="#19">19</a></td></tr
><tr id="gr_svn352_20"

><td id="20"><a href="#20">20</a></td></tr
><tr id="gr_svn352_21"

><td id="21"><a href="#21">21</a></td></tr
><tr id="gr_svn352_22"

><td id="22"><a href="#22">22</a></td></tr
><tr id="gr_svn352_23"

><td id="23"><a href="#23">23</a></td></tr
><tr id="gr_svn352_24"

><td id="24"><a href="#24">24</a></td></tr
><tr id="gr_svn352_25"

><td id="25"><a href="#25">25</a></td></tr
><tr id="gr_svn352_26"

><td id="26"><a href="#26">26</a></td></tr
><tr id="gr_svn352_27"

><td id="27"><a href="#27">27</a></td></tr
><tr id="gr_svn352_28"

><td id="28"><a href="#28">28</a></td></tr
><tr id="gr_svn352_29"

><td id="29"><a href="#29">29</a></td></tr
><tr id="gr_svn352_30"

><td id="30"><a href="#30">30</a></td></tr
><tr id="gr_svn352_31"

><td id="31"><a href="#31">31</a></td></tr
><tr id="gr_svn352_32"

><td id="32"><a href="#32">32</a></td></tr
><tr id="gr_svn352_33"

><td id="33"><a href="#33">33</a></td></tr
><tr id="gr_svn352_34"

><td id="34"><a href="#34">34</a></td></tr
><tr id="gr_svn352_35"

><td id="35"><a href="#35">35</a></td></tr
><tr id="gr_svn352_36"

><td id="36"><a href="#36">36</a></td></tr
><tr id="gr_svn352_37"

><td id="37"><a href="#37">37</a></td></tr
><tr id="gr_svn352_38"

><td id="38"><a href="#38">38</a></td></tr
><tr id="gr_svn352_39"

><td id="39"><a href="#39">39</a></td></tr
><tr id="gr_svn352_40"

><td id="40"><a href="#40">40</a></td></tr
><tr id="gr_svn352_41"

><td id="41"><a href="#41">41</a></td></tr
><tr id="gr_svn352_42"

><td id="42"><a href="#42">42</a></td></tr
><tr id="gr_svn352_43"

><td id="43"><a href="#43">43</a></td></tr
><tr id="gr_svn352_44"

><td id="44"><a href="#44">44</a></td></tr
><tr id="gr_svn352_45"

><td id="45"><a href="#45">45</a></td></tr
><tr id="gr_svn352_46"

><td id="46"><a href="#46">46</a></td></tr
><tr id="gr_svn352_47"

><td id="47"><a href="#47">47</a></td></tr
><tr id="gr_svn352_48"

><td id="48"><a href="#48">48</a></td></tr
><tr id="gr_svn352_49"

><td id="49"><a href="#49">49</a></td></tr
><tr id="gr_svn352_50"

><td id="50"><a href="#50">50</a></td></tr
><tr id="gr_svn352_51"

><td id="51"><a href="#51">51</a></td></tr
><tr id="gr_svn352_52"

><td id="52"><a href="#52">52</a></td></tr
><tr id="gr_svn352_53"

><td id="53"><a href="#53">53</a></td></tr
><tr id="gr_svn352_54"

><td id="54"><a href="#54">54</a></td></tr
><tr id="gr_svn352_55"

><td id="55"><a href="#55">55</a></td></tr
><tr id="gr_svn352_56"

><td id="56"><a href="#56">56</a></td></tr
><tr id="gr_svn352_57"

><td id="57"><a href="#57">57</a></td></tr
><tr id="gr_svn352_58"

><td id="58"><a href="#58">58</a></td></tr
><tr id="gr_svn352_59"

><td id="59"><a href="#59">59</a></td></tr
><tr id="gr_svn352_60"

><td id="60"><a href="#60">60</a></td></tr
><tr id="gr_svn352_61"

><td id="61"><a href="#61">61</a></td></tr
><tr id="gr_svn352_62"

><td id="62"><a href="#62">62</a></td></tr
><tr id="gr_svn352_63"

><td id="63"><a href="#63">63</a></td></tr
><tr id="gr_svn352_64"

><td id="64"><a href="#64">64</a></td></tr
><tr id="gr_svn352_65"

><td id="65"><a href="#65">65</a></td></tr
><tr id="gr_svn352_66"

><td id="66"><a href="#66">66</a></td></tr
><tr id="gr_svn352_67"

><td id="67"><a href="#67">67</a></td></tr
><tr id="gr_svn352_68"

><td id="68"><a href="#68">68</a></td></tr
><tr id="gr_svn352_69"

><td id="69"><a href="#69">69</a></td></tr
><tr id="gr_svn352_70"

><td id="70"><a href="#70">70</a></td></tr
><tr id="gr_svn352_71"

><td id="71"><a href="#71">71</a></td></tr
><tr id="gr_svn352_72"

><td id="72"><a href="#72">72</a></td></tr
><tr id="gr_svn352_73"

><td id="73"><a href="#73">73</a></td></tr
><tr id="gr_svn352_74"

><td id="74"><a href="#74">74</a></td></tr
><tr id="gr_svn352_75"

><td id="75"><a href="#75">75</a></td></tr
><tr id="gr_svn352_76"

><td id="76"><a href="#76">76</a></td></tr
><tr id="gr_svn352_77"

><td id="77"><a href="#77">77</a></td></tr
><tr id="gr_svn352_78"

><td id="78"><a href="#78">78</a></td></tr
><tr id="gr_svn352_79"

><td id="79"><a href="#79">79</a></td></tr
><tr id="gr_svn352_80"

><td id="80"><a href="#80">80</a></td></tr
><tr id="gr_svn352_81"

><td id="81"><a href="#81">81</a></td></tr
><tr id="gr_svn352_82"

><td id="82"><a href="#82">82</a></td></tr
><tr id="gr_svn352_83"

><td id="83"><a href="#83">83</a></td></tr
><tr id="gr_svn352_84"

><td id="84"><a href="#84">84</a></td></tr
><tr id="gr_svn352_85"

><td id="85"><a href="#85">85</a></td></tr
><tr id="gr_svn352_86"

><td id="86"><a href="#86">86</a></td></tr
><tr id="gr_svn352_87"

><td id="87"><a href="#87">87</a></td></tr
><tr id="gr_svn352_88"

><td id="88"><a href="#88">88</a></td></tr
><tr id="gr_svn352_89"

><td id="89"><a href="#89">89</a></td></tr
><tr id="gr_svn352_90"

><td id="90"><a href="#90">90</a></td></tr
><tr id="gr_svn352_91"

><td id="91"><a href="#91">91</a></td></tr
><tr id="gr_svn352_92"

><td id="92"><a href="#92">92</a></td></tr
><tr id="gr_svn352_93"

><td id="93"><a href="#93">93</a></td></tr
><tr id="gr_svn352_94"

><td id="94"><a href="#94">94</a></td></tr
><tr id="gr_svn352_95"

><td id="95"><a href="#95">95</a></td></tr
><tr id="gr_svn352_96"

><td id="96"><a href="#96">96</a></td></tr
><tr id="gr_svn352_97"

><td id="97"><a href="#97">97</a></td></tr
><tr id="gr_svn352_98"

><td id="98"><a href="#98">98</a></td></tr
><tr id="gr_svn352_99"

><td id="99"><a href="#99">99</a></td></tr
><tr id="gr_svn352_100"

><td id="100"><a href="#100">100</a></td></tr
><tr id="gr_svn352_101"

><td id="101"><a href="#101">101</a></td></tr
><tr id="gr_svn352_102"

><td id="102"><a href="#102">102</a></td></tr
><tr id="gr_svn352_103"

><td id="103"><a href="#103">103</a></td></tr
><tr id="gr_svn352_104"

><td id="104"><a href="#104">104</a></td></tr
><tr id="gr_svn352_105"

><td id="105"><a href="#105">105</a></td></tr
><tr id="gr_svn352_106"

><td id="106"><a href="#106">106</a></td></tr
><tr id="gr_svn352_107"

><td id="107"><a href="#107">107</a></td></tr
><tr id="gr_svn352_108"

><td id="108"><a href="#108">108</a></td></tr
><tr id="gr_svn352_109"

><td id="109"><a href="#109">109</a></td></tr
><tr id="gr_svn352_110"

><td id="110"><a href="#110">110</a></td></tr
><tr id="gr_svn352_111"

><td id="111"><a href="#111">111</a></td></tr
><tr id="gr_svn352_112"

><td id="112"><a href="#112">112</a></td></tr
><tr id="gr_svn352_113"

><td id="113"><a href="#113">113</a></td></tr
><tr id="gr_svn352_114"

><td id="114"><a href="#114">114</a></td></tr
><tr id="gr_svn352_115"

><td id="115"><a href="#115">115</a></td></tr
><tr id="gr_svn352_116"

><td id="116"><a href="#116">116</a></td></tr
><tr id="gr_svn352_117"

><td id="117"><a href="#117">117</a></td></tr
><tr id="gr_svn352_118"

><td id="118"><a href="#118">118</a></td></tr
><tr id="gr_svn352_119"

><td id="119"><a href="#119">119</a></td></tr
><tr id="gr_svn352_120"

><td id="120"><a href="#120">120</a></td></tr
><tr id="gr_svn352_121"

><td id="121"><a href="#121">121</a></td></tr
><tr id="gr_svn352_122"

><td id="122"><a href="#122">122</a></td></tr
><tr id="gr_svn352_123"

><td id="123"><a href="#123">123</a></td></tr
><tr id="gr_svn352_124"

><td id="124"><a href="#124">124</a></td></tr
><tr id="gr_svn352_125"

><td id="125"><a href="#125">125</a></td></tr
><tr id="gr_svn352_126"

><td id="126"><a href="#126">126</a></td></tr
><tr id="gr_svn352_127"

><td id="127"><a href="#127">127</a></td></tr
><tr id="gr_svn352_128"

><td id="128"><a href="#128">128</a></td></tr
><tr id="gr_svn352_129"

><td id="129"><a href="#129">129</a></td></tr
><tr id="gr_svn352_130"

><td id="130"><a href="#130">130</a></td></tr
><tr id="gr_svn352_131"

><td id="131"><a href="#131">131</a></td></tr
><tr id="gr_svn352_132"

><td id="132"><a href="#132">132</a></td></tr
><tr id="gr_svn352_133"

><td id="133"><a href="#133">133</a></td></tr
><tr id="gr_svn352_134"

><td id="134"><a href="#134">134</a></td></tr
><tr id="gr_svn352_135"

><td id="135"><a href="#135">135</a></td></tr
><tr id="gr_svn352_136"

><td id="136"><a href="#136">136</a></td></tr
><tr id="gr_svn352_137"

><td id="137"><a href="#137">137</a></td></tr
><tr id="gr_svn352_138"

><td id="138"><a href="#138">138</a></td></tr
><tr id="gr_svn352_139"

><td id="139"><a href="#139">139</a></td></tr
><tr id="gr_svn352_140"

><td id="140"><a href="#140">140</a></td></tr
><tr id="gr_svn352_141"

><td id="141"><a href="#141">141</a></td></tr
><tr id="gr_svn352_142"

><td id="142"><a href="#142">142</a></td></tr
><tr id="gr_svn352_143"

><td id="143"><a href="#143">143</a></td></tr
><tr id="gr_svn352_144"

><td id="144"><a href="#144">144</a></td></tr
><tr id="gr_svn352_145"

><td id="145"><a href="#145">145</a></td></tr
><tr id="gr_svn352_146"

><td id="146"><a href="#146">146</a></td></tr
><tr id="gr_svn352_147"

><td id="147"><a href="#147">147</a></td></tr
><tr id="gr_svn352_148"

><td id="148"><a href="#148">148</a></td></tr
><tr id="gr_svn352_149"

><td id="149"><a href="#149">149</a></td></tr
><tr id="gr_svn352_150"

><td id="150"><a href="#150">150</a></td></tr
><tr id="gr_svn352_151"

><td id="151"><a href="#151">151</a></td></tr
><tr id="gr_svn352_152"

><td id="152"><a href="#152">152</a></td></tr
><tr id="gr_svn352_153"

><td id="153"><a href="#153">153</a></td></tr
><tr id="gr_svn352_154"

><td id="154"><a href="#154">154</a></td></tr
><tr id="gr_svn352_155"

><td id="155"><a href="#155">155</a></td></tr
><tr id="gr_svn352_156"

><td id="156"><a href="#156">156</a></td></tr
><tr id="gr_svn352_157"

><td id="157"><a href="#157">157</a></td></tr
><tr id="gr_svn352_158"

><td id="158"><a href="#158">158</a></td></tr
><tr id="gr_svn352_159"

><td id="159"><a href="#159">159</a></td></tr
><tr id="gr_svn352_160"

><td id="160"><a href="#160">160</a></td></tr
><tr id="gr_svn352_161"

><td id="161"><a href="#161">161</a></td></tr
><tr id="gr_svn352_162"

><td id="162"><a href="#162">162</a></td></tr
><tr id="gr_svn352_163"

><td id="163"><a href="#163">163</a></td></tr
><tr id="gr_svn352_164"

><td id="164"><a href="#164">164</a></td></tr
><tr id="gr_svn352_165"

><td id="165"><a href="#165">165</a></td></tr
><tr id="gr_svn352_166"

><td id="166"><a href="#166">166</a></td></tr
><tr id="gr_svn352_167"

><td id="167"><a href="#167">167</a></td></tr
><tr id="gr_svn352_168"

><td id="168"><a href="#168">168</a></td></tr
><tr id="gr_svn352_169"

><td id="169"><a href="#169">169</a></td></tr
><tr id="gr_svn352_170"

><td id="170"><a href="#170">170</a></td></tr
><tr id="gr_svn352_171"

><td id="171"><a href="#171">171</a></td></tr
><tr id="gr_svn352_172"

><td id="172"><a href="#172">172</a></td></tr
><tr id="gr_svn352_173"

><td id="173"><a href="#173">173</a></td></tr
><tr id="gr_svn352_174"

><td id="174"><a href="#174">174</a></td></tr
><tr id="gr_svn352_175"

><td id="175"><a href="#175">175</a></td></tr
><tr id="gr_svn352_176"

><td id="176"><a href="#176">176</a></td></tr
><tr id="gr_svn352_177"

><td id="177"><a href="#177">177</a></td></tr
><tr id="gr_svn352_178"

><td id="178"><a href="#178">178</a></td></tr
><tr id="gr_svn352_179"

><td id="179"><a href="#179">179</a></td></tr
><tr id="gr_svn352_180"

><td id="180"><a href="#180">180</a></td></tr
><tr id="gr_svn352_181"

><td id="181"><a href="#181">181</a></td></tr
><tr id="gr_svn352_182"

><td id="182"><a href="#182">182</a></td></tr
><tr id="gr_svn352_183"

><td id="183"><a href="#183">183</a></td></tr
><tr id="gr_svn352_184"

><td id="184"><a href="#184">184</a></td></tr
><tr id="gr_svn352_185"

><td id="185"><a href="#185">185</a></td></tr
><tr id="gr_svn352_186"

><td id="186"><a href="#186">186</a></td></tr
><tr id="gr_svn352_187"

><td id="187"><a href="#187">187</a></td></tr
><tr id="gr_svn352_188"

><td id="188"><a href="#188">188</a></td></tr
><tr id="gr_svn352_189"

><td id="189"><a href="#189">189</a></td></tr
><tr id="gr_svn352_190"

><td id="190"><a href="#190">190</a></td></tr
><tr id="gr_svn352_191"

><td id="191"><a href="#191">191</a></td></tr
><tr id="gr_svn352_192"

><td id="192"><a href="#192">192</a></td></tr
><tr id="gr_svn352_193"

><td id="193"><a href="#193">193</a></td></tr
><tr id="gr_svn352_194"

><td id="194"><a href="#194">194</a></td></tr
><tr id="gr_svn352_195"

><td id="195"><a href="#195">195</a></td></tr
><tr id="gr_svn352_196"

><td id="196"><a href="#196">196</a></td></tr
><tr id="gr_svn352_197"

><td id="197"><a href="#197">197</a></td></tr
><tr id="gr_svn352_198"

><td id="198"><a href="#198">198</a></td></tr
><tr id="gr_svn352_199"

><td id="199"><a href="#199">199</a></td></tr
><tr id="gr_svn352_200"

><td id="200"><a href="#200">200</a></td></tr
><tr id="gr_svn352_201"

><td id="201"><a href="#201">201</a></td></tr
><tr id="gr_svn352_202"

><td id="202"><a href="#202">202</a></td></tr
><tr id="gr_svn352_203"

><td id="203"><a href="#203">203</a></td></tr
><tr id="gr_svn352_204"

><td id="204"><a href="#204">204</a></td></tr
><tr id="gr_svn352_205"

><td id="205"><a href="#205">205</a></td></tr
><tr id="gr_svn352_206"

><td id="206"><a href="#206">206</a></td></tr
><tr id="gr_svn352_207"

><td id="207"><a href="#207">207</a></td></tr
><tr id="gr_svn352_208"

><td id="208"><a href="#208">208</a></td></tr
><tr id="gr_svn352_209"

><td id="209"><a href="#209">209</a></td></tr
><tr id="gr_svn352_210"

><td id="210"><a href="#210">210</a></td></tr
><tr id="gr_svn352_211"

><td id="211"><a href="#211">211</a></td></tr
><tr id="gr_svn352_212"

><td id="212"><a href="#212">212</a></td></tr
><tr id="gr_svn352_213"

><td id="213"><a href="#213">213</a></td></tr
><tr id="gr_svn352_214"

><td id="214"><a href="#214">214</a></td></tr
><tr id="gr_svn352_215"

><td id="215"><a href="#215">215</a></td></tr
><tr id="gr_svn352_216"

><td id="216"><a href="#216">216</a></td></tr
><tr id="gr_svn352_217"

><td id="217"><a href="#217">217</a></td></tr
><tr id="gr_svn352_218"

><td id="218"><a href="#218">218</a></td></tr
><tr id="gr_svn352_219"

><td id="219"><a href="#219">219</a></td></tr
><tr id="gr_svn352_220"

><td id="220"><a href="#220">220</a></td></tr
><tr id="gr_svn352_221"

><td id="221"><a href="#221">221</a></td></tr
><tr id="gr_svn352_222"

><td id="222"><a href="#222">222</a></td></tr
><tr id="gr_svn352_223"

><td id="223"><a href="#223">223</a></td></tr
><tr id="gr_svn352_224"

><td id="224"><a href="#224">224</a></td></tr
><tr id="gr_svn352_225"

><td id="225"><a href="#225">225</a></td></tr
><tr id="gr_svn352_226"

><td id="226"><a href="#226">226</a></td></tr
><tr id="gr_svn352_227"

><td id="227"><a href="#227">227</a></td></tr
><tr id="gr_svn352_228"

><td id="228"><a href="#228">228</a></td></tr
><tr id="gr_svn352_229"

><td id="229"><a href="#229">229</a></td></tr
><tr id="gr_svn352_230"

><td id="230"><a href="#230">230</a></td></tr
><tr id="gr_svn352_231"

><td id="231"><a href="#231">231</a></td></tr
><tr id="gr_svn352_232"

><td id="232"><a href="#232">232</a></td></tr
><tr id="gr_svn352_233"

><td id="233"><a href="#233">233</a></td></tr
><tr id="gr_svn352_234"

><td id="234"><a href="#234">234</a></td></tr
><tr id="gr_svn352_235"

><td id="235"><a href="#235">235</a></td></tr
><tr id="gr_svn352_236"

><td id="236"><a href="#236">236</a></td></tr
><tr id="gr_svn352_237"

><td id="237"><a href="#237">237</a></td></tr
><tr id="gr_svn352_238"

><td id="238"><a href="#238">238</a></td></tr
><tr id="gr_svn352_239"

><td id="239"><a href="#239">239</a></td></tr
><tr id="gr_svn352_240"

><td id="240"><a href="#240">240</a></td></tr
><tr id="gr_svn352_241"

><td id="241"><a href="#241">241</a></td></tr
><tr id="gr_svn352_242"

><td id="242"><a href="#242">242</a></td></tr
><tr id="gr_svn352_243"

><td id="243"><a href="#243">243</a></td></tr
><tr id="gr_svn352_244"

><td id="244"><a href="#244">244</a></td></tr
><tr id="gr_svn352_245"

><td id="245"><a href="#245">245</a></td></tr
><tr id="gr_svn352_246"

><td id="246"><a href="#246">246</a></td></tr
><tr id="gr_svn352_247"

><td id="247"><a href="#247">247</a></td></tr
><tr id="gr_svn352_248"

><td id="248"><a href="#248">248</a></td></tr
><tr id="gr_svn352_249"

><td id="249"><a href="#249">249</a></td></tr
><tr id="gr_svn352_250"

><td id="250"><a href="#250">250</a></td></tr
><tr id="gr_svn352_251"

><td id="251"><a href="#251">251</a></td></tr
><tr id="gr_svn352_252"

><td id="252"><a href="#252">252</a></td></tr
><tr id="gr_svn352_253"

><td id="253"><a href="#253">253</a></td></tr
><tr id="gr_svn352_254"

><td id="254"><a href="#254">254</a></td></tr
><tr id="gr_svn352_255"

><td id="255"><a href="#255">255</a></td></tr
><tr id="gr_svn352_256"

><td id="256"><a href="#256">256</a></td></tr
><tr id="gr_svn352_257"

><td id="257"><a href="#257">257</a></td></tr
><tr id="gr_svn352_258"

><td id="258"><a href="#258">258</a></td></tr
><tr id="gr_svn352_259"

><td id="259"><a href="#259">259</a></td></tr
><tr id="gr_svn352_260"

><td id="260"><a href="#260">260</a></td></tr
><tr id="gr_svn352_261"

><td id="261"><a href="#261">261</a></td></tr
><tr id="gr_svn352_262"

><td id="262"><a href="#262">262</a></td></tr
><tr id="gr_svn352_263"

><td id="263"><a href="#263">263</a></td></tr
><tr id="gr_svn352_264"

><td id="264"><a href="#264">264</a></td></tr
><tr id="gr_svn352_265"

><td id="265"><a href="#265">265</a></td></tr
><tr id="gr_svn352_266"

><td id="266"><a href="#266">266</a></td></tr
><tr id="gr_svn352_267"

><td id="267"><a href="#267">267</a></td></tr
><tr id="gr_svn352_268"

><td id="268"><a href="#268">268</a></td></tr
><tr id="gr_svn352_269"

><td id="269"><a href="#269">269</a></td></tr
><tr id="gr_svn352_270"

><td id="270"><a href="#270">270</a></td></tr
><tr id="gr_svn352_271"

><td id="271"><a href="#271">271</a></td></tr
><tr id="gr_svn352_272"

><td id="272"><a href="#272">272</a></td></tr
><tr id="gr_svn352_273"

><td id="273"><a href="#273">273</a></td></tr
><tr id="gr_svn352_274"

><td id="274"><a href="#274">274</a></td></tr
><tr id="gr_svn352_275"

><td id="275"><a href="#275">275</a></td></tr
><tr id="gr_svn352_276"

><td id="276"><a href="#276">276</a></td></tr
><tr id="gr_svn352_277"

><td id="277"><a href="#277">277</a></td></tr
><tr id="gr_svn352_278"

><td id="278"><a href="#278">278</a></td></tr
><tr id="gr_svn352_279"

><td id="279"><a href="#279">279</a></td></tr
><tr id="gr_svn352_280"

><td id="280"><a href="#280">280</a></td></tr
><tr id="gr_svn352_281"

><td id="281"><a href="#281">281</a></td></tr
><tr id="gr_svn352_282"

><td id="282"><a href="#282">282</a></td></tr
><tr id="gr_svn352_283"

><td id="283"><a href="#283">283</a></td></tr
><tr id="gr_svn352_284"

><td id="284"><a href="#284">284</a></td></tr
><tr id="gr_svn352_285"

><td id="285"><a href="#285">285</a></td></tr
><tr id="gr_svn352_286"

><td id="286"><a href="#286">286</a></td></tr
><tr id="gr_svn352_287"

><td id="287"><a href="#287">287</a></td></tr
><tr id="gr_svn352_288"

><td id="288"><a href="#288">288</a></td></tr
><tr id="gr_svn352_289"

><td id="289"><a href="#289">289</a></td></tr
><tr id="gr_svn352_290"

><td id="290"><a href="#290">290</a></td></tr
><tr id="gr_svn352_291"

><td id="291"><a href="#291">291</a></td></tr
><tr id="gr_svn352_292"

><td id="292"><a href="#292">292</a></td></tr
><tr id="gr_svn352_293"

><td id="293"><a href="#293">293</a></td></tr
><tr id="gr_svn352_294"

><td id="294"><a href="#294">294</a></td></tr
><tr id="gr_svn352_295"

><td id="295"><a href="#295">295</a></td></tr
><tr id="gr_svn352_296"

><td id="296"><a href="#296">296</a></td></tr
><tr id="gr_svn352_297"

><td id="297"><a href="#297">297</a></td></tr
><tr id="gr_svn352_298"

><td id="298"><a href="#298">298</a></td></tr
><tr id="gr_svn352_299"

><td id="299"><a href="#299">299</a></td></tr
><tr id="gr_svn352_300"

><td id="300"><a href="#300">300</a></td></tr
><tr id="gr_svn352_301"

><td id="301"><a href="#301">301</a></td></tr
><tr id="gr_svn352_302"

><td id="302"><a href="#302">302</a></td></tr
><tr id="gr_svn352_303"

><td id="303"><a href="#303">303</a></td></tr
><tr id="gr_svn352_304"

><td id="304"><a href="#304">304</a></td></tr
><tr id="gr_svn352_305"

><td id="305"><a href="#305">305</a></td></tr
><tr id="gr_svn352_306"

><td id="306"><a href="#306">306</a></td></tr
><tr id="gr_svn352_307"

><td id="307"><a href="#307">307</a></td></tr
><tr id="gr_svn352_308"

><td id="308"><a href="#308">308</a></td></tr
><tr id="gr_svn352_309"

><td id="309"><a href="#309">309</a></td></tr
></table></pre>
<pre><table width="100%"><tr class="nocursor"><td></td></tr></table></pre>
</td>
<td id="lines">
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
<pre ><table id="src_table_0"><tr
id=sl_svn352_1

><td class="source">// Copyright (c) 2011, the Dart project authors.  Please see the AUTHORS file<br></td></tr
><tr
id=sl_svn352_2

><td class="source">// for details. All rights reserved. Use of this source code is governed by a<br></td></tr
><tr
id=sl_svn352_3

><td class="source">// BSD-style license that can be found in the LICENSE file.<br></td></tr
><tr
id=sl_svn352_4

><td class="source"><br></td></tr
><tr
id=sl_svn352_5

><td class="source">#library(&#39;spirodraw&#39;);<br></td></tr
><tr
id=sl_svn352_6

><td class="source"><br></td></tr
><tr
id=sl_svn352_7

><td class="source">#import(&#39;dart:dom&#39;);<br></td></tr
><tr
id=sl_svn352_8

><td class="source">#source(&quot;ColorPicker.dart&quot;);<br></td></tr
><tr
id=sl_svn352_9

><td class="source">#resource(&quot;spirodraw.css&quot;);<br></td></tr
><tr
id=sl_svn352_10

><td class="source"><br></td></tr
><tr
id=sl_svn352_11

><td class="source">void main() {<br></td></tr
><tr
id=sl_svn352_12

><td class="source">  new Spirodraw().go();<br></td></tr
><tr
id=sl_svn352_13

><td class="source">}<br></td></tr
><tr
id=sl_svn352_14

><td class="source"><br></td></tr
><tr
id=sl_svn352_15

><td class="source">class Spirodraw {<br></td></tr
><tr
id=sl_svn352_16

><td class="source"><br></td></tr
><tr
id=sl_svn352_17

><td class="source">  static double PI2 = Math.PI * 2;<br></td></tr
><tr
id=sl_svn352_18

><td class="source">  Document doc;<br></td></tr
><tr
id=sl_svn352_19

><td class="source">  // Scale factor used to scale wheel radius from 1-10 to pixels<br></td></tr
><tr
id=sl_svn352_20

><td class="source">  int RUnits, rUnits, dUnits;<br></td></tr
><tr
id=sl_svn352_21

><td class="source">  // Fixed radius, wheel radius, pen distance in pixels<br></td></tr
><tr
id=sl_svn352_22

><td class="source">  double R, r, d; <br></td></tr
><tr
id=sl_svn352_23

><td class="source">  HTMLInputElement fixedRadiusSlider, wheelRadiusSlider, <br></td></tr
><tr
id=sl_svn352_24

><td class="source">    penRadiusSlider, penWidthSlider, speedSlider;<br></td></tr
><tr
id=sl_svn352_25

><td class="source">  HTMLSelectElement inOrOut;<br></td></tr
><tr
id=sl_svn352_26

><td class="source">  HTMLLabelElement numTurns;<br></td></tr
><tr
id=sl_svn352_27

><td class="source">  HTMLDivElement mainDiv;<br></td></tr
><tr
id=sl_svn352_28

><td class="source">  num lastX, lastY;<br></td></tr
><tr
id=sl_svn352_29

><td class="source">  int height, width, xc, yc;<br></td></tr
><tr
id=sl_svn352_30

><td class="source">  int maxTurns;<br></td></tr
><tr
id=sl_svn352_31

><td class="source">  HTMLCanvasElement frontCanvas, backCanvas;<br></td></tr
><tr
id=sl_svn352_32

><td class="source">  CanvasRenderingContext2D front, back;<br></td></tr
><tr
id=sl_svn352_33

><td class="source">  HTMLCanvasElement paletteElement; <br></td></tr
><tr
id=sl_svn352_34

><td class="source">  ColorPicker colorPicker;<br></td></tr
><tr
id=sl_svn352_35

><td class="source">  String penColor = &quot;red&quot;;<br></td></tr
><tr
id=sl_svn352_36

><td class="source">  int penWidth;<br></td></tr
><tr
id=sl_svn352_37

><td class="source">  double rad = 0.0;<br></td></tr
><tr
id=sl_svn352_38

><td class="source">  double stepSize;<br></td></tr
><tr
id=sl_svn352_39

><td class="source">  bool animationEnabled = true;<br></td></tr
><tr
id=sl_svn352_40

><td class="source">  int numPoints;<br></td></tr
><tr
id=sl_svn352_41

><td class="source">  double speed;<br></td></tr
><tr
id=sl_svn352_42

><td class="source">  bool run;<br></td></tr
><tr
id=sl_svn352_43

><td class="source">  <br></td></tr
><tr
id=sl_svn352_44

><td class="source">  Spirodraw() {<br></td></tr
><tr
id=sl_svn352_45

><td class="source">    doc = window.document;<br></td></tr
><tr
id=sl_svn352_46

><td class="source">    inOrOut = doc.getElementById(&quot;in_out&quot;);<br></td></tr
><tr
id=sl_svn352_47

><td class="source">    fixedRadiusSlider = doc.getElementById(&quot;fixed_radius&quot;);<br></td></tr
><tr
id=sl_svn352_48

><td class="source">    wheelRadiusSlider = doc.getElementById(&quot;wheel_radius&quot;);<br></td></tr
><tr
id=sl_svn352_49

><td class="source">    penRadiusSlider = doc.getElementById(&quot;pen_radius&quot;);<br></td></tr
><tr
id=sl_svn352_50

><td class="source">    penWidthSlider = doc.getElementById(&quot;pen_width&quot;);<br></td></tr
><tr
id=sl_svn352_51

><td class="source">    speedSlider = doc.getElementById(&quot;speed&quot;);<br></td></tr
><tr
id=sl_svn352_52

><td class="source">    numTurns = doc.getElementById(&quot;num_turns&quot;);<br></td></tr
><tr
id=sl_svn352_53

><td class="source">    mainDiv = doc.getElementById(&quot;main&quot;);<br></td></tr
><tr
id=sl_svn352_54

><td class="source">    frontCanvas = doc.getElementById(&quot;canvas&quot;);<br></td></tr
><tr
id=sl_svn352_55

><td class="source">    front = frontCanvas.getContext(&quot;2d&quot;);<br></td></tr
><tr
id=sl_svn352_56

><td class="source">    backCanvas = doc.createElement(&quot;canvas&quot;);<br></td></tr
><tr
id=sl_svn352_57

><td class="source">    back = backCanvas.getContext(&quot;2d&quot;);<br></td></tr
><tr
id=sl_svn352_58

><td class="source">    paletteElement = doc.getElementById(&quot;palette&quot;);<br></td></tr
><tr
id=sl_svn352_59

><td class="source">    window.onresize = (EventListener) { onResize(); };<br></td></tr
><tr
id=sl_svn352_60

><td class="source">    initControlPanel();<br></td></tr
><tr
id=sl_svn352_61

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_62

><td class="source"><br></td></tr
><tr
id=sl_svn352_63

><td class="source">  void go() {<br></td></tr
><tr
id=sl_svn352_64

><td class="source">    onResize();<br></td></tr
><tr
id=sl_svn352_65

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_66

><td class="source">  <br></td></tr
><tr
id=sl_svn352_67

><td class="source">  void onResize() {<br></td></tr
><tr
id=sl_svn352_68

><td class="source">    height = window.innerHeight;<br></td></tr
><tr
id=sl_svn352_69

><td class="source">    width = window.innerWidth - 270;<br></td></tr
><tr
id=sl_svn352_70

><td class="source">    yc = height~/2;<br></td></tr
><tr
id=sl_svn352_71

><td class="source">    xc = width~/2;<br></td></tr
><tr
id=sl_svn352_72

><td class="source">    frontCanvas.height = height;<br></td></tr
><tr
id=sl_svn352_73

><td class="source">    frontCanvas.width = width;<br></td></tr
><tr
id=sl_svn352_74

><td class="source">    backCanvas.height = height;<br></td></tr
><tr
id=sl_svn352_75

><td class="source">    backCanvas.width = width;<br></td></tr
><tr
id=sl_svn352_76

><td class="source">    clear();<br></td></tr
><tr
id=sl_svn352_77

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_78

><td class="source">  <br></td></tr
><tr
id=sl_svn352_79

><td class="source">  void initControlPanel() {<br></td></tr
><tr
id=sl_svn352_80

><td class="source">    inOrOut.onchange = (EventListener) { refresh(); };<br></td></tr
><tr
id=sl_svn352_81

><td class="source">    fixedRadiusSlider.onchange = (EventListener) { refresh(); };<br></td></tr
><tr
id=sl_svn352_82

><td class="source">    wheelRadiusSlider.onchange = (EventListener) { refresh(); };<br></td></tr
><tr
id=sl_svn352_83

><td class="source">    speedSlider.onchange = (EventListener) { onSpeedChange(); };<br></td></tr
><tr
id=sl_svn352_84

><td class="source">    penRadiusSlider.onchange = (EventListener) { refresh(); };<br></td></tr
><tr
id=sl_svn352_85

><td class="source">    penWidthSlider.onchange = (EventListener) { onPenWidthChange(); };<br></td></tr
><tr
id=sl_svn352_86

><td class="source">    colorPicker = new ColorPicker(paletteElement);<br></td></tr
><tr
id=sl_svn352_87

><td class="source">    colorPicker.addListener((String color) { onColorChange(color); });<br></td></tr
><tr
id=sl_svn352_88

><td class="source">    doc.getElementById(&quot;start&quot;).onclick = (EventListener) { start(); };<br></td></tr
><tr
id=sl_svn352_89

><td class="source">    doc.getElementById(&quot;stop&quot;).onclick = (EventListener) { stop(); };<br></td></tr
><tr
id=sl_svn352_90

><td class="source">    doc.getElementById(&quot;clear&quot;).onclick = (EventListener) { clear(); };<br></td></tr
><tr
id=sl_svn352_91

><td class="source">    doc.getElementById(&quot;lucky&quot;).onclick = (EventListener) { lucky(); };<br></td></tr
><tr
id=sl_svn352_92

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_93

><td class="source">  <br></td></tr
><tr
id=sl_svn352_94

><td class="source">  void onColorChange(String color) {<br></td></tr
><tr
id=sl_svn352_95

><td class="source">    penColor = color;<br></td></tr
><tr
id=sl_svn352_96

><td class="source">    drawFrame(rad);<br></td></tr
><tr
id=sl_svn352_97

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_98

><td class="source"><br></td></tr
><tr
id=sl_svn352_99

><td class="source">  void onSpeedChange() {<br></td></tr
><tr
id=sl_svn352_100

><td class="source">    speed = speedSlider.valueAsNumber;<br></td></tr
><tr
id=sl_svn352_101

><td class="source">    stepSize = calcStepSize();<br></td></tr
><tr
id=sl_svn352_102

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_103

><td class="source">  <br></td></tr
><tr
id=sl_svn352_104

><td class="source">  void onPenWidthChange() {<br></td></tr
><tr
id=sl_svn352_105

><td class="source">    penWidth = penWidthSlider.valueAsNumber;<br></td></tr
><tr
id=sl_svn352_106

><td class="source">    drawFrame(rad);<br></td></tr
><tr
id=sl_svn352_107

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_108

><td class="source">  <br></td></tr
><tr
id=sl_svn352_109

><td class="source">  void refresh() {<br></td></tr
><tr
id=sl_svn352_110

><td class="source">    stop();<br></td></tr
><tr
id=sl_svn352_111

><td class="source">    // Reset<br></td></tr
><tr
id=sl_svn352_112

><td class="source">    lastX = lastY = 0;<br></td></tr
><tr
id=sl_svn352_113

><td class="source">    // Compute fixed radius<br></td></tr
><tr
id=sl_svn352_114

><td class="source">    // based on starting diameter == min / 2, fixed radius == 10 units<br></td></tr
><tr
id=sl_svn352_115

><td class="source">    int min = Math.min(height, width);<br></td></tr
><tr
id=sl_svn352_116

><td class="source">    double pixelsPerUnit = min / 40;<br></td></tr
><tr
id=sl_svn352_117

><td class="source">    RUnits = fixedRadiusSlider.valueAsNumber;<br></td></tr
><tr
id=sl_svn352_118

><td class="source">    R = RUnits * pixelsPerUnit;<br></td></tr
><tr
id=sl_svn352_119

><td class="source">    // Scale inner radius and pen distance in units of fixed radius<br></td></tr
><tr
id=sl_svn352_120

><td class="source">    rUnits = wheelRadiusSlider.valueAsNumber;<br></td></tr
><tr
id=sl_svn352_121

><td class="source">    r = rUnits * R/RUnits * Math.parseInt(inOrOut.value);<br></td></tr
><tr
id=sl_svn352_122

><td class="source">    dUnits = penRadiusSlider.valueAsNumber;<br></td></tr
><tr
id=sl_svn352_123

><td class="source">    d = dUnits * R/RUnits;<br></td></tr
><tr
id=sl_svn352_124

><td class="source">    numPoints = calcNumPoints();<br></td></tr
><tr
id=sl_svn352_125

><td class="source">    maxTurns = calcTurns();<br></td></tr
><tr
id=sl_svn352_126

><td class="source">    onSpeedChange();<br></td></tr
><tr
id=sl_svn352_127

><td class="source">    numTurns.innerText = &quot;0&quot; + &quot;/&quot; + maxTurns;<br></td></tr
><tr
id=sl_svn352_128

><td class="source">    penWidth = penWidthSlider.valueAsNumber;<br></td></tr
><tr
id=sl_svn352_129

><td class="source">    drawFrame(0.0);<br></td></tr
><tr
id=sl_svn352_130

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_131

><td class="source"><br></td></tr
><tr
id=sl_svn352_132

><td class="source">  int calcNumPoints() {<br></td></tr
><tr
id=sl_svn352_133

><td class="source">    if ((dUnits==0) || (rUnits==0))<br></td></tr
><tr
id=sl_svn352_134

><td class="source">      // Empirically, treat it like an oval<br></td></tr
><tr
id=sl_svn352_135

><td class="source">      return 2;<br></td></tr
><tr
id=sl_svn352_136

><td class="source">    int gcf = gcf(RUnits, rUnits);<br></td></tr
><tr
id=sl_svn352_137

><td class="source">    int n = RUnits ~/ gcf;<br></td></tr
><tr
id=sl_svn352_138

><td class="source">    int d = rUnits ~/ gcf;<br></td></tr
><tr
id=sl_svn352_139

><td class="source">    if (n % 2 == 1)<br></td></tr
><tr
id=sl_svn352_140

><td class="source">      // odd<br></td></tr
><tr
id=sl_svn352_141

><td class="source">      return n;<br></td></tr
><tr
id=sl_svn352_142

><td class="source">    else if (d %2 == 1)<br></td></tr
><tr
id=sl_svn352_143

><td class="source">      return n;<br></td></tr
><tr
id=sl_svn352_144

><td class="source">    else<br></td></tr
><tr
id=sl_svn352_145

><td class="source">      return n~/2;<br></td></tr
><tr
id=sl_svn352_146

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_147

><td class="source"><br></td></tr
><tr
id=sl_svn352_148

><td class="source">  // TODO return optimum step size in radians<br></td></tr
><tr
id=sl_svn352_149

><td class="source">  double calcStepSize() =&gt; speed / 100 * maxTurns / numPoints;<br></td></tr
><tr
id=sl_svn352_150

><td class="source"><br></td></tr
><tr
id=sl_svn352_151

><td class="source">  void drawFrame(double theta) {<br></td></tr
><tr
id=sl_svn352_152

><td class="source">    if (animationEnabled) {<br></td></tr
><tr
id=sl_svn352_153

><td class="source">      front.clearRect(0, 0, width, height);<br></td></tr
><tr
id=sl_svn352_154

><td class="source">      front.drawImage(backCanvas, 0, 0);<br></td></tr
><tr
id=sl_svn352_155

><td class="source">      drawFixed();<br></td></tr
><tr
id=sl_svn352_156

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_157

><td class="source">    drawWheel(theta);<br></td></tr
><tr
id=sl_svn352_158

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_159

><td class="source"><br></td></tr
><tr
id=sl_svn352_160

><td class="source">  void animate(int time) {<br></td></tr
><tr
id=sl_svn352_161

><td class="source">    if (run &amp;&amp; rad &lt;= maxTurns * PI2) {<br></td></tr
><tr
id=sl_svn352_162

><td class="source">      rad+=stepSize;<br></td></tr
><tr
id=sl_svn352_163

><td class="source">      drawFrame(rad);<br></td></tr
><tr
id=sl_svn352_164

><td class="source">      num nTurns = rad / PI2;<br></td></tr
><tr
id=sl_svn352_165

><td class="source">      numTurns.innerText = &#39;${nTurns.floor()}/$maxTurns&#39;;<br></td></tr
><tr
id=sl_svn352_166

><td class="source">      window.webkitRequestAnimationFrame(animate, frontCanvas);<br></td></tr
><tr
id=sl_svn352_167

><td class="source">    } else {<br></td></tr
><tr
id=sl_svn352_168

><td class="source">      stop();<br></td></tr
><tr
id=sl_svn352_169

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_170

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_171

><td class="source">  <br></td></tr
><tr
id=sl_svn352_172

><td class="source">  void start() {<br></td></tr
><tr
id=sl_svn352_173

><td class="source">    refresh();<br></td></tr
><tr
id=sl_svn352_174

><td class="source">    rad = 0.0;<br></td></tr
><tr
id=sl_svn352_175

><td class="source">    run = true;<br></td></tr
><tr
id=sl_svn352_176

><td class="source">    window.webkitRequestAnimationFrame(animate, frontCanvas); <br></td></tr
><tr
id=sl_svn352_177

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_178

><td class="source"><br></td></tr
><tr
id=sl_svn352_179

><td class="source">  int calcTurns() {<br></td></tr
><tr
id=sl_svn352_180

><td class="source">    // compute ratio of wheel radius to big R then find LCM<br></td></tr
><tr
id=sl_svn352_181

><td class="source">    if ((dUnits==0) || (rUnits==0))<br></td></tr
><tr
id=sl_svn352_182

><td class="source">      return 1;<br></td></tr
><tr
id=sl_svn352_183

><td class="source">    int ru = rUnits.abs();<br></td></tr
><tr
id=sl_svn352_184

><td class="source">    int wrUnits = RUnits + rUnits;<br></td></tr
><tr
id=sl_svn352_185

><td class="source">    int g = gcf (wrUnits, ru);<br></td></tr
><tr
id=sl_svn352_186

><td class="source">    return ru ~/ g;<br></td></tr
><tr
id=sl_svn352_187

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_188

><td class="source"><br></td></tr
><tr
id=sl_svn352_189

><td class="source">  void stop() {<br></td></tr
><tr
id=sl_svn352_190

><td class="source">    run = false;<br></td></tr
><tr
id=sl_svn352_191

><td class="source">    // Show drawing only<br></td></tr
><tr
id=sl_svn352_192

><td class="source">    front.clearRect(0, 0, width, height);<br></td></tr
><tr
id=sl_svn352_193

><td class="source">    front.drawImage(backCanvas, 0, 0);<br></td></tr
><tr
id=sl_svn352_194

><td class="source">    // Reset angle<br></td></tr
><tr
id=sl_svn352_195

><td class="source">    rad = 0.0;<br></td></tr
><tr
id=sl_svn352_196

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_197

><td class="source"><br></td></tr
><tr
id=sl_svn352_198

><td class="source">  void clear() {<br></td></tr
><tr
id=sl_svn352_199

><td class="source">    stop();<br></td></tr
><tr
id=sl_svn352_200

><td class="source">    back.clearRect(0, 0, width, height);<br></td></tr
><tr
id=sl_svn352_201

><td class="source">    refresh();<br></td></tr
><tr
id=sl_svn352_202

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_203

><td class="source"><br></td></tr
><tr
id=sl_svn352_204

><td class="source">  /**<br></td></tr
><tr
id=sl_svn352_205

><td class="source">   * Choose random settings for wheel and pen, but<br></td></tr
><tr
id=sl_svn352_206

><td class="source">   * leave fixed radius alone as it often changes<br></td></tr
><tr
id=sl_svn352_207

><td class="source">   * things too much.<br></td></tr
><tr
id=sl_svn352_208

><td class="source">   */<br></td></tr
><tr
id=sl_svn352_209

><td class="source">  void lucky() {<br></td></tr
><tr
id=sl_svn352_210

><td class="source">    wheelRadiusSlider.valueAsNumber = Math.random() * 9;<br></td></tr
><tr
id=sl_svn352_211

><td class="source">    penRadiusSlider.valueAsNumber = Math.random() * 9;<br></td></tr
><tr
id=sl_svn352_212

><td class="source">    penWidthSlider.valueAsNumber = 1 + Math.random() * 9;<br></td></tr
><tr
id=sl_svn352_213

><td class="source">    colorPicker.selectedColor = Math.random() * 215;<br></td></tr
><tr
id=sl_svn352_214

><td class="source">    start();<br></td></tr
><tr
id=sl_svn352_215

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_216

><td class="source"><br></td></tr
><tr
id=sl_svn352_217

><td class="source">  void drawFixed() {<br></td></tr
><tr
id=sl_svn352_218

><td class="source">    if (animationEnabled) {<br></td></tr
><tr
id=sl_svn352_219

><td class="source">      front.beginPath();<br></td></tr
><tr
id=sl_svn352_220

><td class="source">      front.setLineWidth(2);<br></td></tr
><tr
id=sl_svn352_221

><td class="source">      front.setStrokeStyle(&quot;gray&quot;);<br></td></tr
><tr
id=sl_svn352_222

><td class="source">      front.arc(xc, yc, R, 0, PI2, true);<br></td></tr
><tr
id=sl_svn352_223

><td class="source">      front.closePath();<br></td></tr
><tr
id=sl_svn352_224

><td class="source">      front.stroke();<br></td></tr
><tr
id=sl_svn352_225

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_226

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_227

><td class="source"><br></td></tr
><tr
id=sl_svn352_228

><td class="source">  /**<br></td></tr
><tr
id=sl_svn352_229

><td class="source">   * Draw the wheel with its center at angle theta<br></td></tr
><tr
id=sl_svn352_230

><td class="source">   * with respect to the fixed wheel<br></td></tr
><tr
id=sl_svn352_231

><td class="source">   * <br></td></tr
><tr
id=sl_svn352_232

><td class="source">   * @param theta<br></td></tr
><tr
id=sl_svn352_233

><td class="source">   */<br></td></tr
><tr
id=sl_svn352_234

><td class="source">  void drawWheel(double theta) {<br></td></tr
><tr
id=sl_svn352_235

><td class="source">    double wx = xc + ((R + r) * Math.cos(theta));<br></td></tr
><tr
id=sl_svn352_236

><td class="source">    double wy = yc - ((R + r) * Math.sin(theta));<br></td></tr
><tr
id=sl_svn352_237

><td class="source">    if (animationEnabled) {<br></td></tr
><tr
id=sl_svn352_238

><td class="source">      if (rUnits&gt;0) {<br></td></tr
><tr
id=sl_svn352_239

><td class="source">        // Draw ring<br></td></tr
><tr
id=sl_svn352_240

><td class="source">        front.beginPath();<br></td></tr
><tr
id=sl_svn352_241

><td class="source">        front.arc(wx, wy, r.abs(), 0, PI2, true);<br></td></tr
><tr
id=sl_svn352_242

><td class="source">        front.closePath();<br></td></tr
><tr
id=sl_svn352_243

><td class="source">        front.stroke();<br></td></tr
><tr
id=sl_svn352_244

><td class="source">        // Draw center<br></td></tr
><tr
id=sl_svn352_245

><td class="source">        front.setLineWidth(1);<br></td></tr
><tr
id=sl_svn352_246

><td class="source">        front.beginPath();<br></td></tr
><tr
id=sl_svn352_247

><td class="source">        front.arc(wx, wy, 3, 0, PI2, true);<br></td></tr
><tr
id=sl_svn352_248

><td class="source">        front.setFillStyle(&quot;black&quot;);<br></td></tr
><tr
id=sl_svn352_249

><td class="source">        front.fill();<br></td></tr
><tr
id=sl_svn352_250

><td class="source">        front.closePath();<br></td></tr
><tr
id=sl_svn352_251

><td class="source">        front.stroke();<br></td></tr
><tr
id=sl_svn352_252

><td class="source">      }<br></td></tr
><tr
id=sl_svn352_253

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_254

><td class="source">    drawTip(wx, wy, theta);<br></td></tr
><tr
id=sl_svn352_255

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_256

><td class="source"><br></td></tr
><tr
id=sl_svn352_257

><td class="source">  /**<br></td></tr
><tr
id=sl_svn352_258

><td class="source">   * Draw a rotating line that shows the wheel rolling and leaves<br></td></tr
><tr
id=sl_svn352_259

><td class="source">   * the pen trace<br></td></tr
><tr
id=sl_svn352_260

><td class="source">   * <br></td></tr
><tr
id=sl_svn352_261

><td class="source">   * @param wx X coordinate of wheel center<br></td></tr
><tr
id=sl_svn352_262

><td class="source">   * @param wy Y coordinate of wheel center<br></td></tr
><tr
id=sl_svn352_263

><td class="source">   * @param theta Angle of wheel center with respect to fixed circle<br></td></tr
><tr
id=sl_svn352_264

><td class="source">   */<br></td></tr
><tr
id=sl_svn352_265

><td class="source">  void drawTip(double wx, double wy, double theta) {<br></td></tr
><tr
id=sl_svn352_266

><td class="source">    // Calc wheel rotation angle<br></td></tr
><tr
id=sl_svn352_267

><td class="source">    double rot = (r==0) ? theta : theta * (R+r) / r;<br></td></tr
><tr
id=sl_svn352_268

><td class="source">    // Find tip of line<br></td></tr
><tr
id=sl_svn352_269

><td class="source">    double tx = wx + d * Math.cos(rot);<br></td></tr
><tr
id=sl_svn352_270

><td class="source">    double ty = wy - d * Math.sin(rot);<br></td></tr
><tr
id=sl_svn352_271

><td class="source">    if (animationEnabled) {<br></td></tr
><tr
id=sl_svn352_272

><td class="source">      front.beginPath();<br></td></tr
><tr
id=sl_svn352_273

><td class="source">      front.setFillStyle(penColor);<br></td></tr
><tr
id=sl_svn352_274

><td class="source">      front.arc(tx, ty, penWidth/2+2, 0, PI2, true);<br></td></tr
><tr
id=sl_svn352_275

><td class="source">      front.fill();<br></td></tr
><tr
id=sl_svn352_276

><td class="source">      front.moveTo(wx, wy);<br></td></tr
><tr
id=sl_svn352_277

><td class="source">      front.setStrokeStyle(&quot;black&quot;);<br></td></tr
><tr
id=sl_svn352_278

><td class="source">      front.lineTo(tx, ty);<br></td></tr
><tr
id=sl_svn352_279

><td class="source">      front.closePath();<br></td></tr
><tr
id=sl_svn352_280

><td class="source">      front.stroke();<br></td></tr
><tr
id=sl_svn352_281

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_282

><td class="source">    drawSegmentTo(tx, ty);<br></td></tr
><tr
id=sl_svn352_283

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_284

><td class="source"><br></td></tr
><tr
id=sl_svn352_285

><td class="source">  void drawSegmentTo(double tx, double ty) {<br></td></tr
><tr
id=sl_svn352_286

><td class="source">    if (lastX &gt; 0) {<br></td></tr
><tr
id=sl_svn352_287

><td class="source">      back.beginPath();<br></td></tr
><tr
id=sl_svn352_288

><td class="source">      back.setStrokeStyle(penColor);<br></td></tr
><tr
id=sl_svn352_289

><td class="source">      back.setLineWidth(penWidth);<br></td></tr
><tr
id=sl_svn352_290

><td class="source">      back.moveTo(lastX, lastY);<br></td></tr
><tr
id=sl_svn352_291

><td class="source">      back.lineTo(tx, ty);<br></td></tr
><tr
id=sl_svn352_292

><td class="source">      back.closePath();<br></td></tr
><tr
id=sl_svn352_293

><td class="source">      back.stroke();<br></td></tr
><tr
id=sl_svn352_294

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_295

><td class="source">    lastX = tx;<br></td></tr
><tr
id=sl_svn352_296

><td class="source">    lastY = ty;<br></td></tr
><tr
id=sl_svn352_297

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_298

><td class="source">  <br></td></tr
><tr
id=sl_svn352_299

><td class="source">}<br></td></tr
><tr
id=sl_svn352_300

><td class="source"><br></td></tr
><tr
id=sl_svn352_301

><td class="source">int gcf(int n, int d) {<br></td></tr
><tr
id=sl_svn352_302

><td class="source">  if (n==d)<br></td></tr
><tr
id=sl_svn352_303

><td class="source">    return n;<br></td></tr
><tr
id=sl_svn352_304

><td class="source">  int max = Math.max(n, d);<br></td></tr
><tr
id=sl_svn352_305

><td class="source">  for (int i = max ~/ 2; i &gt; 1; i--)<br></td></tr
><tr
id=sl_svn352_306

><td class="source">    if ((n % i == 0) &amp;&amp; (d % i == 0))<br></td></tr
><tr
id=sl_svn352_307

><td class="source">      return i;<br></td></tr
><tr
id=sl_svn352_308

><td class="source">  return 1;<br></td></tr
><tr
id=sl_svn352_309

><td class="source">}<br></td></tr
></table></pre>
<pre><table width="100%"><tr class="cursor_stop cursor_hidden"><td></td></tr></table></pre>
</td>
</tr></table>

 
<script type="text/javascript">
 var lineNumUnderMouse = -1;
 
 function gutterOver(num) {
 gutterOut();
 var newTR = document.getElementById('gr_svn352_' + num);
 if (newTR) {
 newTR.className = 'undermouse';
 }
 lineNumUnderMouse = num;
 }
 function gutterOut() {
 if (lineNumUnderMouse != -1) {
 var oldTR = document.getElementById(
 'gr_svn352_' + lineNumUnderMouse);
 if (oldTR) {
 oldTR.className = '';
 }
 lineNumUnderMouse = -1;
 }
 }
 var numsGenState = {table_base_id: 'nums_table_'};
 var srcGenState = {table_base_id: 'src_table_'};
 var alignerRunning = false;
 var startOver = false;
 function setLineNumberHeights() {
 if (alignerRunning) {
 startOver = true;
 return;
 }
 numsGenState.chunk_id = 0;
 numsGenState.table = document.getElementById('nums_table_0');
 numsGenState.row_num = 0;
 if (!numsGenState.table) {
 return; // Silently exit if no file is present.
 }
 srcGenState.chunk_id = 0;
 srcGenState.table = document.getElementById('src_table_0');
 srcGenState.row_num = 0;
 alignerRunning = true;
 continueToSetLineNumberHeights();
 }
 function rowGenerator(genState) {
 if (genState.row_num < genState.table.rows.length) {
 var currentRow = genState.table.rows[genState.row_num];
 genState.row_num++;
 return currentRow;
 }
 var newTable = document.getElementById(
 genState.table_base_id + (genState.chunk_id + 1));
 if (newTable) {
 genState.chunk_id++;
 genState.row_num = 0;
 genState.table = newTable;
 return genState.table.rows[0];
 }
 return null;
 }
 var MAX_ROWS_PER_PASS = 1000;
 function continueToSetLineNumberHeights() {
 var rowsInThisPass = 0;
 var numRow = 1;
 var srcRow = 1;
 while (numRow && srcRow && rowsInThisPass < MAX_ROWS_PER_PASS) {
 numRow = rowGenerator(numsGenState);
 srcRow = rowGenerator(srcGenState);
 rowsInThisPass++;
 if (numRow && srcRow) {
 if (numRow.offsetHeight != srcRow.offsetHeight) {
 numRow.firstChild.style.height = srcRow.offsetHeight + 'px';
 }
 }
 }
 if (rowsInThisPass >= MAX_ROWS_PER_PASS) {
 setTimeout(continueToSetLineNumberHeights, 10);
 } else {
 alignerRunning = false;
 if (startOver) {
 startOver = false;
 setTimeout(setLineNumberHeights, 500);
 }
 }
 }
 function initLineNumberHeights() {
 // Do 2 complete passes, because there can be races
 // between this code and prettify.
 startOver = true;
 setTimeout(setLineNumberHeights, 250);
 window.onresize = setLineNumberHeights;
 }
 initLineNumberHeights();
</script>

 
 
 <div id="log">
 <div style="text-align:right">
 <a class="ifCollapse" href="#" onclick="_toggleMeta('', 'p', 'dart', this)">Show details</a>
 <a class="ifExpand" href="#" onclick="_toggleMeta('', 'p', 'dart', this)">Hide details</a>
 </div>
 <div class="ifExpand">
 
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="changelog">
 <p>Change log</p>
 <div>
 <a href="/p/dart/source/detail?spec=svn352&amp;r=263">r263</a>
 by drfibona...@google.com
 on Oct 7 (4 days ago)
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=263&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old=149">Diff</a>
 </div>
 <pre>Minor changes to make spirodraw sample
match the walkthrough.
Review URL: <a href="https://chromereviews.googlepl" rel="nofollow">https://chromereviews.googlepl</a>
ex.com/3574020</pre>
 </div>
 
 
 
 
 
 
 <script type="text/javascript">
 var detail_url = '/p/dart/source/detail?r=263&spec=svn352';
 var publish_url = '/p/dart/source/detail?r=263&spec=svn352#publish';
 // describe the paths of this revision in javascript.
 var changed_paths = [];
 var changed_urls = [];
 
 changed_paths.push('/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart');
 changed_urls.push('/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart?r\x3d263\x26spec\x3dsvn352');
 
 
 changed_paths.push('/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart');
 changed_urls.push('/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart?r\x3d263\x26spec\x3dsvn352');
 
 var selected_path = '/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart';
 
 
 function getCurrentPageIndex() {
 for (var i = 0; i < changed_paths.length; i++) {
 if (selected_path == changed_paths[i]) {
 return i;
 }
 }
 }
 function getNextPage() {
 var i = getCurrentPageIndex();
 if (i < changed_paths.length - 1) {
 return changed_urls[i + 1];
 }
 return null;
 }
 function getPreviousPage() {
 var i = getCurrentPageIndex();
 if (i > 0) {
 return changed_urls[i - 1];
 }
 return null;
 }
 function gotoNextPage() {
 var page = getNextPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoPreviousPage() {
 var page = getPreviousPage();
 if (!page) {
 page = detail_url;
 }
 window.location = page;
 }
 function gotoDetailPage() {
 window.location = detail_url;
 }
 function gotoPublishPage() {
 window.location = publish_url;
 }
</script>

 
 <style type="text/css">
 #review_nav {
 border-top: 3px solid white;
 padding-top: 6px;
 margin-top: 1em;
 }
 #review_nav td {
 vertical-align: middle;
 }
 #review_nav select {
 margin: .5em 0;
 }
 </style>
 <div id="review_nav">
 <table><tr><td>Go to:&nbsp;</td><td>
 <select name="files_in_rev" onchange="window.location=this.value">
 
 <option value="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart?r=263&amp;spec=svn352"
 
 >...mples/spirodraw/ColorPicker.dart</option>
 
 <option value="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart?r=263&amp;spec=svn352"
 selected="selected"
 >...samples/spirodraw/Spirodraw.dart</option>
 
 </select>
 </td></tr></table>
 
 
 




 
 </div>
 
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="older_bubble">
 <p>Older revisions</p>
 
 
 <div class="closed" style="margin-bottom:3px;" >
 <img class="ifClosed" onclick="_toggleHidden(this)" src="https://ssl.gstatic.com/codesite/ph/images/plus.gif" >
 <img class="ifOpened" onclick="_toggleHidden(this)" src="https://ssl.gstatic.com/codesite/ph/images/minus.gif" >
 <a href="/p/dart/source/detail?spec=svn352&r=149">r149</a>
 by drfibona...@google.com
 on Oct 6 (5 days ago)
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=149&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old=146">Diff</a>
 <br>
 <pre class="ifOpened">Fix remaining type warning
Review URL: <a href="https://chromereviews.goog" rel="nofollow">https://chromereviews.goog</a>
leplex.com/3539017</pre>
 </div>
 
 <div class="closed" style="margin-bottom:3px;" >
 <img class="ifClosed" onclick="_toggleHidden(this)" src="https://ssl.gstatic.com/codesite/ph/images/plus.gif" >
 <img class="ifOpened" onclick="_toggleHidden(this)" src="https://ssl.gstatic.com/codesite/ph/images/minus.gif" >
 <a href="/p/dart/source/detail?spec=svn352&r=146">r146</a>
 by drfibona...@google.com
 on Oct 6 (5 days ago)
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=146&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old=141">Diff</a>
 <br>
 <pre class="ifOpened">Array-&gt;List, removed static on top-
level gcf function
Review URL: <a href="https://chromereviews.goog" rel="nofollow">https://chromereviews.goog</a>
leplex.com/3548018</pre>
 </div>
 
 <div class="closed" style="margin-bottom:3px;" >
 <img class="ifClosed" onclick="_toggleHidden(this)" src="https://ssl.gstatic.com/codesite/ph/images/plus.gif" >
 <img class="ifOpened" onclick="_toggleHidden(this)" src="https://ssl.gstatic.com/codesite/ph/images/minus.gif" >
 <a href="/p/dart/source/detail?spec=svn352&r=141">r141</a>
 by drfibona...@google.com
 on Oct 6 (5 days ago)
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=141&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&amp;old=">Diff</a>
 <br>
 <pre class="ifOpened">Adding spirodraw sample
Review at <a href="https://chromereviews.google" rel="nofollow">https://chromereviews.google</a>
plex.com/3514022/</pre>
 </div>
 
 
 <a href="/p/dart/source/list?path=/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart&start=263">All revisions of this file</a>
 </div>
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 
 <div class="pmeta_bubble_bg" style="border:1px solid white">
 <div class="round4"></div>
 <div class="round2"></div>
 <div class="round1"></div>
 <div class="box-inner">
 <div id="fileinfo_bubble">
 <p>File info</p>
 
 <div>Size: 8423 bytes,
 309 lines</div>
 
 <div><a href="//dart.googlecode.com/svn/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart">View raw file</a></div>
 </div>
 
 </div>
 <div class="round1"></div>
 <div class="round2"></div>
 <div class="round4"></div>
 </div>
 </div>
 </div>


</div>

</div>
</div>


<script src="https://ssl.gstatic.com/codesite/ph/13841197563397998716/js/source_file_scripts.js"></script>

 <script type="text/javascript" src="https://kibbles.googlecode.com/files/kibbles-1.3.3.comp.js"></script>
 <script type="text/javascript">
 var lastStop = null;
 var initialized = false;
 
 function updateCursor(next, prev) {
 if (prev && prev.element) {
 prev.element.className = 'cursor_stop cursor_hidden';
 }
 if (next && next.element) {
 next.element.className = 'cursor_stop cursor';
 lastStop = next.index;
 }
 }
 
 function pubRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftRevealed(data) {
 updateCursorForCell(data.cellId, 'cursor_stop cursor_hidden');
 if (initialized) {
 reloadCursors();
 }
 }
 
 function draftDestroyed(data) {
 updateCursorForCell(data.cellId, 'nocursor');
 if (initialized) {
 reloadCursors();
 }
 }
 function reloadCursors() {
 kibbles.skipper.reset();
 loadCursors();
 if (lastStop != null) {
 kibbles.skipper.setCurrentStop(lastStop);
 }
 }
 // possibly the simplest way to insert any newly added comments
 // is to update the class of the corresponding cursor row,
 // then refresh the entire list of rows.
 function updateCursorForCell(cellId, className) {
 var cell = document.getElementById(cellId);
 // we have to go two rows back to find the cursor location
 var row = getPreviousElement(cell.parentNode);
 row.className = className;
 }
 // returns the previous element, ignores text nodes.
 function getPreviousElement(e) {
 var element = e.previousSibling;
 if (element.nodeType == 3) {
 element = element.previousSibling;
 }
 if (element && element.tagName) {
 return element;
 }
 }
 function loadCursors() {
 // register our elements with skipper
 var elements = CR_getElements('*', 'cursor_stop');
 var len = elements.length;
 for (var i = 0; i < len; i++) {
 var element = elements[i]; 
 element.className = 'cursor_stop cursor_hidden';
 kibbles.skipper.append(element);
 }
 }
 function toggleComments() {
 CR_toggleCommentDisplay();
 reloadCursors();
 }
 function keysOnLoadHandler() {
 // setup skipper
 kibbles.skipper.addStopListener(
 kibbles.skipper.LISTENER_TYPE.PRE, updateCursor);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_top', 50);
 // Set the 'offset' option to return the middle of the client area
 // an option can be a static value, or a callback
 kibbles.skipper.setOption('padding_bottom', 100);
 // Register our keys
 kibbles.skipper.addFwdKey("n");
 kibbles.skipper.addRevKey("p");
 kibbles.keys.addKeyPressListener(
 'u', function() { window.location = detail_url; });
 kibbles.keys.addKeyPressListener(
 'r', function() { window.location = detail_url + '#publish'; });
 
 kibbles.keys.addKeyPressListener('j', gotoNextPage);
 kibbles.keys.addKeyPressListener('k', gotoPreviousPage);
 
 
 }
 </script>
<script src="https://ssl.gstatic.com/codesite/ph/13841197563397998716/js/code_review_scripts.js"></script>
<script type="text/javascript">
 function showPublishInstructions() {
 var element = document.getElementById('review_instr');
 if (element) {
 element.className = 'opened';
 }
 }
 var codereviews;
 function revsOnLoadHandler() {
 // register our source container with the commenting code
 var paths = {'svn352': '/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart'}
 codereviews = CR_controller.setup(
 {"profileUrl":null,"token":null,"assetHostPath":"https://ssl.gstatic.com/codesite/ph","domainName":null,"assetVersionPath":"https://ssl.gstatic.com/codesite/ph/13841197563397998716","projectHomeUrl":"/p/dart","relativeBaseUrl":"","projectName":"dart","loggedInUserEmail":null}, '', 'svn352', paths,
 CR_BrowseIntegrationFactory);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, showPublishInstructions);
 
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_PUB_PLATE, pubRevealed);
 codereviews.registerActivityListener(CR_ActivityType.REVEAL_DRAFT_PLATE, draftRevealed);
 codereviews.registerActivityListener(CR_ActivityType.DISCARD_DRAFT_COMMENT, draftDestroyed);
 
 
 
 
 
 
 
 var initialized = true;
 reloadCursors();
 }
 window.onload = function() {keysOnLoadHandler(); revsOnLoadHandler();};

</script>
<script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/13841197563397998716/js/dit_scripts.js"></script>

 
 
 
 <script type="text/javascript" src="https://ssl.gstatic.com/codesite/ph/13841197563397998716/js/ph_core.js"></script>
 
 
 
 
 <script type="text/javascript" src="/js/codesite_product_dictionary_ph.pack.04102009.js"></script>
</div> 
<div id="footer" dir="ltr">
 <div class="text">
 &copy;2011 Google -
 <a href="/projecthosting/terms.html">Terms</a> -
 <a href="http://www.google.com/privacy.html">Privacy</a> -
 <a href="/p/support/">Project Hosting Help</a>
 </div>
</div>
 <div class="hostedBy" style="margin-top: -20px;">
 <span style="vertical-align: top;">Powered by <a href="http://code.google.com/projecthosting/">Google Project Hosting</a></span>
 </div>
 
 


 
 </body>
</html>

