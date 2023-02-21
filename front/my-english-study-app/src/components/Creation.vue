<template>
  <div>
    <div class="sm-title">{{ smTitle }}</div>
    <div class="row">
      <div class="col-9">
        <div>
          <input
            class="input-text"
            v-model="fristData"
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
    <CategoryTable></CategoryTable>
  </div>
</template>
<script>
import CategoryTable from '@/components/CategoryTable.vue'

export default {
  name: 'Creation',
  components: { CategoryTable },
  props: {
    smTitle: String,
    firstInput: String,
    secondInput: String
  },
  data() {
    return {
      fristData: '',
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
