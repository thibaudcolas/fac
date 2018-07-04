



<!DOCTYPE html>
<html>
<head>
 <link rel="icon" type="image/vnd.microsoft.icon" href="https://ssl.gstatic.com/codesite/ph/images/phosting.ico">
 
 
 <script type="text/javascript">
 
 (function(){function a(b){this.t={};this.tick=function(b,d,e){d=e!=void 0?e:(new Date).getTime();this.t[b]=d};this.tick("start",null,b)}var c=new a;window.jstiming={Timer:a,load:c};try{var f=null;window.chrome&&window.chrome.csi&&(f=Math.floor(window.chrome.csi().pageT));f==null&&window.gtbExternal&&(f=window.gtbExternal.pageT());f==null&&window.external&&(f=window.external.pageT);f&&(window.jstiming.pt=f)}catch(g){};})();

 
 
 
 
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
 
 
 <title>ColorPicker.dart - 
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
 | <a href="https://www.google.com/accounts/ServiceLogin?service=code&amp;ltmpl=phosting&amp;continue=https%3A%2F%2Fcode.google.com%2Fp%2Fdart%2Fsource%2Fbrowse%2Fbranches%2Fbleeding_edge%2Fdart%2Fclient%2Fsamples%2Fspirodraw%2FColorPicker.dart&amp;followup=https%3A%2F%2Fcode.google.com%2Fp%2Fdart%2Fsource%2Fbrowse%2Fbranches%2Fbleeding_edge%2Fdart%2Fclient%2Fsamples%2Fspirodraw%2FColorPicker.dart" onclick="_CS_click('/gb/ph/signin');"><u>Sign in</u></a>
 
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
 <span id="crumb_links" class="ifClosed"><a href="/p/dart/source/browse/branches/">branches</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/">bleeding_edge</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/">dart</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/">client</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/">samples</a><span class="sp">/&nbsp;</span><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/">spirodraw</a><span class="sp">/&nbsp;</span>ColorPicker.dart</span>
 
 

 </td>
 
 
 <td nowrap="nowrap" width="33%" align="right">
 <table cellpadding="0" cellspacing="0" style="font-size: 100%"><tr>
 
 
 <td class="flipper">
 <ul class="leftside">
 
 <li><a href="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart?r=146" title="Previous">&lsaquo;r146</a></li>
 
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

><td class="source">typedef void PickerListener(String selectedColor);<br></td></tr
><tr
id=sl_svn352_6

><td class="source"><br></td></tr
><tr
id=sl_svn352_7

><td class="source">class ColorPicker {<br></td></tr
><tr
id=sl_svn352_8

><td class="source"><br></td></tr
><tr
id=sl_svn352_9

><td class="source">  static final hexValues = [&#39;00&#39;, &#39;33&#39;, &#39;66&#39;, &#39;99&#39;, &#39;CC&#39;, &#39;FF&#39;];<br></td></tr
><tr
id=sl_svn352_10

><td class="source">  static final COLS = 18;<br></td></tr
><tr
id=sl_svn352_11

><td class="source">  // Block height, width, padding<br></td></tr
><tr
id=sl_svn352_12

><td class="source">  static final BH = 10;<br></td></tr
><tr
id=sl_svn352_13

><td class="source">  static final BW = 10;<br></td></tr
><tr
id=sl_svn352_14

><td class="source">  static final BP = 1;<br></td></tr
><tr
id=sl_svn352_15

><td class="source">  final List&lt;PickerListener&gt; _listeners;<br></td></tr
><tr
id=sl_svn352_16

><td class="source">  HTMLCanvasElement canvasElement;<br></td></tr
><tr
id=sl_svn352_17

><td class="source">  String _selectedColor = &#39;red&#39;;<br></td></tr
><tr
id=sl_svn352_18

><td class="source">  final height = 160;<br></td></tr
><tr
id=sl_svn352_19

><td class="source">  final width = 180;<br></td></tr
><tr
id=sl_svn352_20

><td class="source">  CanvasRenderingContext2D ctx;<br></td></tr
><tr
id=sl_svn352_21

><td class="source">  <br></td></tr
><tr
id=sl_svn352_22

><td class="source">  ColorPicker(this.canvasElement) :<br></td></tr
><tr
id=sl_svn352_23

><td class="source">    _listeners = []<br></td></tr
><tr
id=sl_svn352_24

><td class="source">  {<br></td></tr
><tr
id=sl_svn352_25

><td class="source">    ctx = canvasElement.getContext(&quot;2d&quot;);<br></td></tr
><tr
id=sl_svn352_26

><td class="source">    drawPalette();<br></td></tr
><tr
id=sl_svn352_27

><td class="source">    addHandlers();<br></td></tr
><tr
id=sl_svn352_28

><td class="source">    showSelected();<br></td></tr
><tr
id=sl_svn352_29

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_30

><td class="source">  <br></td></tr
><tr
id=sl_svn352_31

><td class="source">  String get selectedColor() =&gt; _selectedColor;<br></td></tr
><tr
id=sl_svn352_32

><td class="source">  <br></td></tr
><tr
id=sl_svn352_33

><td class="source">  void set selectedColor(num i) {<br></td></tr
><tr
id=sl_svn352_34

><td class="source">    _selectedColor = getHexString(i.floor());<br></td></tr
><tr
id=sl_svn352_35

><td class="source">    showSelected();<br></td></tr
><tr
id=sl_svn352_36

><td class="source">    fireSelected();<br></td></tr
><tr
id=sl_svn352_37

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_38

><td class="source">  <br></td></tr
><tr
id=sl_svn352_39

><td class="source">  void onMouseMove(MouseEvent event) {<br></td></tr
><tr
id=sl_svn352_40

><td class="source">    int x = event.offsetX;<br></td></tr
><tr
id=sl_svn352_41

><td class="source">    int y = event.offsetY - 40;<br></td></tr
><tr
id=sl_svn352_42

><td class="source">    if (( y &lt; 0) || (x &gt;= width)) {<br></td></tr
><tr
id=sl_svn352_43

><td class="source">      return;<br></td></tr
><tr
id=sl_svn352_44

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_45

><td class="source">    ctx.setFillStyle(getHexString(getColorIndex(x, y)));<br></td></tr
><tr
id=sl_svn352_46

><td class="source">    ctx.fillRect(0, 0, width/2, 30);<br></td></tr
><tr
id=sl_svn352_47

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_48

><td class="source"><br></td></tr
><tr
id=sl_svn352_49

><td class="source">  void onMouseDown(MouseEvent event) {<br></td></tr
><tr
id=sl_svn352_50

><td class="source">    Element elt = event.target;<br></td></tr
><tr
id=sl_svn352_51

><td class="source">    event.cancelBubble = true;<br></td></tr
><tr
id=sl_svn352_52

><td class="source">    int x = event.offsetX;<br></td></tr
><tr
id=sl_svn352_53

><td class="source">    int y = event.offsetY - 40;<br></td></tr
><tr
id=sl_svn352_54

><td class="source">    if ((y &lt; 0) || (x &gt;= width))<br></td></tr
><tr
id=sl_svn352_55

><td class="source">      return;<br></td></tr
><tr
id=sl_svn352_56

><td class="source">    selectedColor = getColorIndex(x, y);<br></td></tr
><tr
id=sl_svn352_57

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_58

><td class="source"><br></td></tr
><tr
id=sl_svn352_59

><td class="source">  /**<br></td></tr
><tr
id=sl_svn352_60

><td class="source">   * Adds a [PickerListener] to receive updates.<br></td></tr
><tr
id=sl_svn352_61

><td class="source">   */<br></td></tr
><tr
id=sl_svn352_62

><td class="source">  void addListener(PickerListener listener) {<br></td></tr
><tr
id=sl_svn352_63

><td class="source">    _listeners.add(listener);<br></td></tr
><tr
id=sl_svn352_64

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_65

><td class="source"><br></td></tr
><tr
id=sl_svn352_66

><td class="source">  void addHandlers() {<br></td></tr
><tr
id=sl_svn352_67

><td class="source">    canvasElement.onmousemove = (e) { onMouseMove(e); };<br></td></tr
><tr
id=sl_svn352_68

><td class="source">    canvasElement.onmousedown = (e) { onMouseDown(e); };<br></td></tr
><tr
id=sl_svn352_69

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_70

><td class="source"><br></td></tr
><tr
id=sl_svn352_71

><td class="source">   void drawPalette() {<br></td></tr
><tr
id=sl_svn352_72

><td class="source">    int i=0;<br></td></tr
><tr
id=sl_svn352_73

><td class="source">    for (int r=0; r &lt; 256; r+=51) {<br></td></tr
><tr
id=sl_svn352_74

><td class="source">      for (int g=0; g &lt; 256; g+=51) {<br></td></tr
><tr
id=sl_svn352_75

><td class="source">        for (int b=0; b &lt; 256; b+=51) {<br></td></tr
><tr
id=sl_svn352_76

><td class="source">          String color = getHexString(i);<br></td></tr
><tr
id=sl_svn352_77

><td class="source">          ctx.setFillStyle(color);<br></td></tr
><tr
id=sl_svn352_78

><td class="source">          int x = BW * (i % COLS);<br></td></tr
><tr
id=sl_svn352_79

><td class="source">          int y = BH * (i ~/ COLS) + 40;<br></td></tr
><tr
id=sl_svn352_80

><td class="source">          ctx.fillRect(x + BP, y + BP, BW - 2 * BP, BH - 2 * BP);<br></td></tr
><tr
id=sl_svn352_81

><td class="source">          i++;<br></td></tr
><tr
id=sl_svn352_82

><td class="source">        }<br></td></tr
><tr
id=sl_svn352_83

><td class="source">      }<br></td></tr
><tr
id=sl_svn352_84

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_85

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_86

><td class="source"><br></td></tr
><tr
id=sl_svn352_87

><td class="source">  void fireSelected() {<br></td></tr
><tr
id=sl_svn352_88

><td class="source">    for (final listener in _listeners) {<br></td></tr
><tr
id=sl_svn352_89

><td class="source">      listener(_selectedColor);<br></td></tr
><tr
id=sl_svn352_90

><td class="source">    }<br></td></tr
><tr
id=sl_svn352_91

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_92

><td class="source"><br></td></tr
><tr
id=sl_svn352_93

><td class="source">  int getColorIndex(int x, int y) {<br></td></tr
><tr
id=sl_svn352_94

><td class="source">    // Get color index 0-215 using row, col<br></td></tr
><tr
id=sl_svn352_95

><td class="source">    int i = y ~/ BH * COLS + x ~/ BW;<br></td></tr
><tr
id=sl_svn352_96

><td class="source">    return i;<br></td></tr
><tr
id=sl_svn352_97

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_98

><td class="source"><br></td></tr
><tr
id=sl_svn352_99

><td class="source">  void showSelected() {<br></td></tr
><tr
id=sl_svn352_100

><td class="source">    ctx.setFillStyle(_selectedColor);<br></td></tr
><tr
id=sl_svn352_101

><td class="source">    ctx.fillRect(width / 2, 0, width / 2, 30);<br></td></tr
><tr
id=sl_svn352_102

><td class="source">    ctx.setFillStyle(&quot;white&quot;);<br></td></tr
><tr
id=sl_svn352_103

><td class="source">    ctx.fillRect(0, 0, width / 2, 30);<br></td></tr
><tr
id=sl_svn352_104

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_105

><td class="source">  <br></td></tr
><tr
id=sl_svn352_106

><td class="source">  String getHexString(int i) {<br></td></tr
><tr
id=sl_svn352_107

><td class="source">    int r = i ~/ 36;<br></td></tr
><tr
id=sl_svn352_108

><td class="source">    int g = (i % 36) ~/ 6;<br></td></tr
><tr
id=sl_svn352_109

><td class="source">    int b = i % 6;<br></td></tr
><tr
id=sl_svn352_110

><td class="source">    return &#39;#${hexValues[r]}${hexValues[g]}${hexValues[b]}&#39;;<br></td></tr
><tr
id=sl_svn352_111

><td class="source">  }<br></td></tr
><tr
id=sl_svn352_112

><td class="source">  <br></td></tr
><tr
id=sl_svn352_113

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
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=263&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&amp;old=146">Diff</a>
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
 
 var selected_path = '/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart';
 
 
 changed_paths.push('/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart');
 changed_urls.push('/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart?r\x3d263\x26spec\x3dsvn352');
 
 
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
 selected="selected"
 >...mples/spirodraw/ColorPicker.dart</option>
 
 <option value="/p/dart/source/browse/branches/bleeding_edge/dart/client/samples/spirodraw/Spirodraw.dart?r=263&amp;spec=svn352"
 
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
 <a href="/p/dart/source/detail?spec=svn352&r=146">r146</a>
 by drfibona...@google.com
 on Oct 6 (5 days ago)
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=146&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&amp;old=141">Diff</a>
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
 &nbsp; <a href="/p/dart/source/diff?spec=svn352&r=141&amp;format=side&amp;path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&amp;old_path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&amp;old=">Diff</a>
 <br>
 <pre class="ifOpened">Adding spirodraw sample
Review at <a href="https://chromereviews.google" rel="nofollow">https://chromereviews.google</a>
plex.com/3514022/</pre>
 </div>
 
 
 <a href="/p/dart/source/list?path=/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart&start=263">All revisions of this file</a>
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
 
 <div>Size: 2822 bytes,
 113 lines</div>
 
 <div><a href="//dart.googlecode.com/svn/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart">View raw file</a></div>
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
 var paths = {'svn352': '/branches/bleeding_edge/dart/client/samples/spirodraw/ColorPicker.dart'}
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
 
 


 
 
 <script type="text/javascript">_CS_reportToCsi();</script>
 
 </body>
</html>

