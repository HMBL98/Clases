---


---

<h1 id="manipulating-bitmasks">Manipulating Bitmasks</h1>
<ol>
<li>
<p>Representacion:<br>
<code>A = 34 (base 10) or 100010 in binary also represents a small set {1, 5};</code></p>
</li>
<li>
<p>Multiplicar o dividir un numero por 2.<br>
<code>We only need to shift the bits in the integer left/right</code><br>
<code>A = A&lt;&lt;1</code><br>
<code>A = A &gt;&gt;1</code></p>
</li>
<li>
<p>Prender el ith bit<br>
<code>A |= (1 &lt;&lt; j).</code></p>
</li>
<li>
<p>Apagar el ith bit<br>
<code>A &amp;= ∼(1 &lt;&lt; j).</code></p>
</li>
<li>
<p>Checar si el ith bit esta prendido<br>
<code>T = A &amp; (1 &lt;&lt; j).</code></p>
</li>
<li>
<p>Cambiar el estado del bit ith<br>
<code>A ∧ = (1 &lt;&lt; j).</code></p>
</li>
<li>
<p>Conseguir valor del bit menos significante<br>
<code>T = (A &amp; (-A)).</code></p>
</li>
<li>
<p>Prender primeros n bits<br>
<code>A = (1 &lt;&lt; n) - 1 ;</code></p>
</li>
<li>
<p>Iterar sobre todos los subconjuntos de tamaño n<br>
<code>for ( x = 0; x &lt; (1 &lt;&lt; n); x++ )</code></p>
</li>
</ol>
<h1 id="meet-in-the-middle">Meet in the middle</h1>
<p>Meet in the middle es una técnica de búsqueda que se usa cuando la entrada es pequeña pero no tan pequeña que se puede usar la fuerza bruta.<br>
Esta tecnica divide el problema en dos , los resuelve individualmente y luego los combina.</p>
<h3 id="problema-1">Problema 1</h3>
<blockquote>
<p>Dado un arreglo A de enteros, debes de verificar si existen 4 números en el arreglo, tal que su suma sea igual cero (Un elemento puede ser usado múltiples veces).<br>
a+b+c+d = 0<br>
Ejemplo: A = [2, 3, 1, 0, -4, -1], una solución es<br>
3 + 1 + 0 – 4 = 0<br>
0 + 0 + 0 + 0 = 0.</p>
</blockquote>
<h3 id="problema-2">Problema 2</h3>
<blockquote>
<p>Dado un conjunto de <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>N</mi><mo stretchy="false">(</mo><mi>N</mi><mo>≤</mo><mn>40</mn><mo stretchy="false">)</mo></mrow><annotation encoding="application/x-tex">N (N≤40)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right: 0.10903em;">N</span><span class="mspace" style="margin-right: 0.277778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.277778em;"></span></span><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord">4</span><span class="mord">0</span><span class="mclose">)</span></span></span></span></span> enteros, cada uno de ellos es como máximo <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>1</mn><msup><mn>0</mn><mn>12</mn></msup></mrow><annotation encoding="application/x-tex">10^{12}</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 0.814108em; vertical-align: 0em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.814108em;"><span class="" style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mtight">1</span><span class="mord mtight">2</span></span></span></span></span></span></span></span></span></span></span></span></span> determinar el subconjunto de suma más grande que tiene una suma menor o igual a <span class="katex--inline"><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>S</mi><mo stretchy="false">(</mo><mi>S</mi><mo>≤</mo><mn>1</mn><msup><mn>0</mn><mn>18</mn></msup><mo stretchy="false">)</mo></mrow><annotation encoding="application/x-tex">S (S ≤ 10^{18})</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="base"><span class="strut" style="height: 1em; vertical-align: -0.25em;"></span><span class="mord mathdefault" style="margin-right: 0.05764em;">S</span><span class="mopen">(</span><span class="mord mathdefault" style="margin-right: 0.05764em;">S</span><span class="mspace" style="margin-right: 0.277778em;"></span><span class="mrel">≤</span><span class="mspace" style="margin-right: 0.277778em;"></span></span><span class="base"><span class="strut" style="height: 1.06411em; vertical-align: -0.25em;"></span><span class="mord">1</span><span class="mord"><span class="mord">0</span><span class="msupsub"><span class="vlist-t"><span class="vlist-r"><span class="vlist" style="height: 0.814108em;"><span class="" style="top: -3.063em; margin-right: 0.05em;"><span class="pstrut" style="height: 2.7em;"></span><span class="sizing reset-size6 size3 mtight"><span class="mord mtight"><span class="mord mtight">1</span><span class="mord mtight">8</span></span></span></span></span></span></span></span></span><span class="mclose">)</span></span></span></span></span></p>
</blockquote>
<pre class=" language-cpp"><code class="prism  language-cpp"><span class="token keyword">int</span> <span class="token function">main</span><span class="token punctuation">(</span><span class="token punctuation">)</span> <span class="token punctuation">{</span>
	<span class="token keyword">int</span> N<span class="token punctuation">;</span> cin <span class="token operator">&gt;&gt;</span> N<span class="token punctuation">;</span>
	<span class="token keyword">for</span><span class="token punctuation">(</span><span class="token keyword">int</span> i <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> i <span class="token operator">&lt;</span> N<span class="token punctuation">;</span> i<span class="token operator">++</span><span class="token punctuation">)</span> cin <span class="token operator">&gt;&gt;</span> A<span class="token punctuation">[</span>i<span class="token punctuation">]</span><span class="token punctuation">;</span>
	<span class="token keyword">int</span> len1 <span class="token operator">=</span> N<span class="token operator">/</span><span class="token number">2</span><span class="token punctuation">;</span>
	<span class="token keyword">int</span> len2 <span class="token operator">=</span> N<span class="token operator">-</span>N<span class="token operator">/</span><span class="token number">2</span><span class="token punctuation">;</span>
	<span class="token comment">// Todos los subconjuntos posibles de la primera mitad</span>
	vector<span class="token operator">&lt;</span>ll<span class="token operator">&gt;</span> sumasPrimeraMitad<span class="token punctuation">;</span>
	<span class="token keyword">for</span><span class="token punctuation">(</span><span class="token keyword">int</span> mask <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> mask <span class="token operator">&lt;</span> <span class="token punctuation">(</span><span class="token number">1</span><span class="token operator">&lt;&lt;</span>len1<span class="token punctuation">)</span><span class="token punctuation">;</span> mask<span class="token operator">++</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
		ll sum <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
		<span class="token keyword">for</span><span class="token punctuation">(</span><span class="token keyword">int</span> bit <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> bit <span class="token operator">&lt;</span> len1<span class="token punctuation">;</span> bit<span class="token operator">++</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
			<span class="token keyword">if</span><span class="token punctuation">(</span>mask<span class="token operator">&amp;</span><span class="token punctuation">(</span><span class="token number">1</span><span class="token operator">&lt;&lt;</span>bit<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">{</span> <span class="token comment">//Bit prendido en mask</span>
				sum <span class="token operator">+</span><span class="token operator">=</span> A<span class="token punctuation">[</span>bit<span class="token punctuation">]</span><span class="token punctuation">;</span>
			<span class="token punctuation">}</span>
		<span class="token punctuation">}</span>
		sumasPrimeraMitad<span class="token punctuation">.</span><span class="token function">push_back</span><span class="token punctuation">(</span>sum<span class="token punctuation">)</span><span class="token punctuation">;</span>
	<span class="token punctuation">}</span>
	<span class="token function">sort</span><span class="token punctuation">(</span><span class="token function">all</span><span class="token punctuation">(</span>sum<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">;</span>
	ll res <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
	<span class="token comment">// Todos los subconjuntos posibles de la segunda mitad</span>
	<span class="token keyword">for</span><span class="token punctuation">(</span><span class="token keyword">int</span> mask <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> mask <span class="token operator">&lt;</span> <span class="token punctuation">(</span><span class="token number">1</span><span class="token operator">&lt;&lt;</span>len2<span class="token punctuation">)</span><span class="token punctuation">;</span> mask<span class="token operator">++</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
		ll sum <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span>
		<span class="token keyword">for</span><span class="token punctuation">(</span><span class="token keyword">int</span> bit <span class="token operator">=</span> <span class="token number">0</span><span class="token punctuation">;</span> bit <span class="token operator">&lt;</span> len2<span class="token punctuation">;</span> bit<span class="token operator">++</span><span class="token punctuation">)</span><span class="token punctuation">{</span>
			<span class="token keyword">if</span><span class="token punctuation">(</span>mask<span class="token operator">&amp;</span><span class="token punctuation">(</span><span class="token number">1</span><span class="token operator">&lt;&lt;</span>bit<span class="token punctuation">)</span><span class="token punctuation">)</span><span class="token punctuation">{</span> <span class="token comment">//Bit prendido en mask</span>
				sum <span class="token operator">+</span><span class="token operator">=</span> A<span class="token punctuation">[</span>bit<span class="token operator">+</span>len1<span class="token punctuation">]</span><span class="token punctuation">;</span>
			<span class="token punctuation">}</span>
		<span class="token punctuation">}</span>
		<span class="token comment">// Mezclar segunda mitad con primera mitad</span>
		ll mejorResultadoActual <span class="token operator">=</span> <span class="token function">binaria</span><span class="token punctuation">(</span>sumasPrimeraMitad<span class="token punctuation">,</span>sum<span class="token punctuation">)</span><span class="token punctuation">;</span>
		res <span class="token operator">=</span> <span class="token function">max</span><span class="token punctuation">(</span>res<span class="token punctuation">,</span>mejorResultadoActual<span class="token punctuation">)</span><span class="token punctuation">;</span>
	<span class="token punctuation">}</span>
</code></pre>
<h3 id="problema-3">Problema 3</h3>
<p><a href="https://codeforces.com/group/PzLcHnJr9l/contest/276873/problem/A">https://codeforces.com/group/PzLcHnJr9l/contest/276873/problem/A</a></p>

