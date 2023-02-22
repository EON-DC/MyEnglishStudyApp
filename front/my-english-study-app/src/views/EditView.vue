<template>
  <div class="box">
    <h1>Edit Page</h1>
  </div>
  <div class="box">
    <div class="sm-title pt-1">{{ smTitle }}</div>
    <div class="row">
      <div class="col-9">
        <div>
          <input
            class="input-text"
            v-model="firstData"
            :placeholder="'add ' + firstInput"
          />
          <input
            class="input-text"
            v-model="secondData"
            :placeholder="'add ' + secondInput"
          />
        </div>
      </div>
      <div class="col-3">
        <button class="btn btn-success btn-sm">save</button> &nbsp;
        <button class="btn btn-danger btn-sm">cancel</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: '',
  components: {},
  data() {
    return {}
  },
  setup() {},
  created() {},
  mounted() {},
  unmounted() {},
  methods: {}
}
</script>
