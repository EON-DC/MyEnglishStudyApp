<template>
  <div>
    <div class="sm-title">{{ smTitle }}</div>
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
        <button class="btn btn-success btn-sm">+</button>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'Creation',
  components: {},
  props: {
    smTitle: String,
    firstInput: String,
    secondInput: String
  },
  data() {
    return {
      firstData: '',
      secondData: ''
    }
  },
  setup() {},
  created() {},
  mounted() {},
  unmounted() {},
  methods: {}
}
</script>
