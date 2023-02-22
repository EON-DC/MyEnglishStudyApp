<template>
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
