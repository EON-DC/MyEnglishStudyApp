<template>
  <div class="box">
    <h1>Creation</h1>
  </div>

  <div class="box">
    <div class="row">
      <div class="col-4 dash-white">
        <div class="sm-title">category</div>
        <div class="row">
          <div class="col-9">
            <div>
              <input
                class="input-text"
                v-model="title"
                placeholder="add category"
              />
              <input class="input-text" v-model="link" placeholder="add link" />
            </div>
          </div>
          <div class="col-3">
            <button class="btn btn-success btn-sm">+</button>
          </div>
        </div>
      </div>
      <div class="col-4 dash-white">
        <div class="sm-title">word</div>
        <div class="row">
          <div class="col-9">
            <div>
              <input
                class="input-text"
                v-model="category_id"
                placeholder="add category_id"
              />
              <input class="input-text" v-model="word" placeholder="add word" />
            </div>
          </div>
          <div class="col-3">
            <button class="btn btn-success btn-sm">+</button>
          </div>
        </div>
      </div>
      <div class="col-4">
        <div class="sm-title">meaning</div>
        <div class="row">
          <div class="col-9">
            <div>
              <input
                class="input-text"
                v-model="word_id"
                placeholder="add word_id"
              />
              <input
                class="input-text"
                v-model="meaning"
                placeholder="add meaning"
              />
            </div>
          </div>
          <div class="col-3">
            <button class="btn btn-success btn-sm">+</button>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div class="box">
    <div class="row">
      <div class="col-4 dash-white">
        <table class="table table-dark table-striped m-1">
          <thead>
            <tr>
              <th>category_id</th>
              <th>category</th>
              <th>link</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>look vs watch vs see</td>
              <td>sdfzsfe</td>
            </tr>
            <tr>
              <td>2</td>
              <td>coke vs pepsi</td>
              <td>zsdf</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="col-4 dash-white">
        <table class="table table-dark table-striped m-1">
          <thead>
            <tr>
              <th>word_id</th>
              <th>word</th>
              <th>category_id</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>look</td>
              <td>sdfzsfe</td>
            </tr>
            <tr>
              <td>2</td>
              <td>coke</td>
              <td>zsdf</td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="col-4">
        <table class="table table-dark table-striped m-1">
          <thead>
            <tr>
              <th>meaning_id</th>
              <th>meaning</th>
              <th>word_id</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>4</td>
              <td>what eys looking...</td>
              <td>1</td>
            </tr>
            <tr>
              <td>5</td>
              <td>watch</td>
              <td>2</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  <div class="box dash-white-top mt-3">
    <div class="row p-2">
      <div class="sm-title">example</div>
      <div class="row">
        <div class="col-9">
          <div>
            <input
              class="input-text long"
              v-model="example"
              placeholder="add example"
            />
            <input
              class="input-text"
              v-model="word_id"
              placeholder="add word_id"
            />
          </div>
        </div>
        <div class="col-3">
          <button class="btn btn-success btn-sm">+</button>
        </div>
      </div>
    </div>
    <div class="row">
      <table class="table table-dark table-striped m-1">
        <thead>
          <tr>
            <th>example_id</th>
            <th>example</th>
            <th>word_id</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>4</td>
            <td>what eys looking...</td>
            <td>1</td>
          </tr>
          <tr>
            <td>5</td>
            <td>watch</td>
            <td>2</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
  <div class="box">
    <div class="row">
      <div class="col-4 dash-white">
        <Creation
          smTitle="category"
          firstInput="category"
          secondInput="link"
        ></Creation>
      </div>
    </div>
  </div>
</template>

<script>
import Creation from '@/components/Creation.vue'
export default {
  name: 'CreateView',
  components: { Creation },
  data() {
    return {
      message: 'cate'
    }
  },
  setup() {},
  created() {},
  mounted() {},
  unmounted() {},
  methods: {}
}
</script>
