<template>
  <nav>
    <router-link to="/">Home</router-link> &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <router-link to="/create">추가</router-link>
    &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <router-link to="/edit">편집</router-link>
    &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <router-link to="/lookup">둘러보기</router-link>
    &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <router-link to="/quiz">퀴즈</router-link>
  </nav>
  <router-view />
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #ffffff;
}
.sm-title {
  font-size: 1.2rem;
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}
.input-text {
  margin-bottom: 0.5rem;
  margin-right: 0.5rem;
  width: 10rem;
}
.text-white {
  color: #ffffff;
}

.long {
  width: 35rem;
}
.box {
  background-color: #222222;
}
.dash-white {
  border-style: none dashed none none;
  outline: whitesmoke;
}
.dash-white-top {
  border-style: dashed none none none;
  outline: whitesmoke;
}
.check {
  background-color: aqua;
}

nav {
  text-align: start;
  font-size: 1.2rem;
  padding: 20px;
}

nav a {
  font-weight: bold;
  color: #aaaaaa;
}
nav a:hover {
  color: #32a956;
}

nav a.router-link-exact-active {
  color: #42b983;
}

h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
