<template>
  <div class="box">
    <h1>Creation</h1>
  </div>

  <div class="box">
    <div class="row">
      <div class="col-4 dash-white">
        <Creation
          smTitle="category"
          firstInput="category"
          secondInput="link"
        ></Creation>
        <CategoryTable></CategoryTable>
      </div>
      <div class="col-4 dash-white">
        <Creation
          smTitle="word"
          firstInput="word"
          secondInput="category_id"
        ></Creation>
        <WordTable></WordTable>
      </div>
      <div class="col-4 dash-white">
        <Creation
          smTitle="meaning"
          firstInput="meaning"
          secondInput="word_id"
        ></Creation>
        <MeaningTable></MeaningTable>
      </div>
    </div>
    <div class="box">
      <div class="box dash-white-top mt-3">
        <CreationLong></CreationLong>
        <ExampleTable></ExampleTable>
      </div>
    </div>
  </div>
</template>

<script>
import Creation from '@/components/Creation.vue'
import CreationLong from '@/components/CreationLong.vue'
import CategoryTable from '@/components/table/CategoryTable.vue'
import ExampleTable from '@/components/table/ExampleTable.vue'
import MeaningTable from '@/components/table/MeaningTable.vue'
import WordTable from '@/components/table/WordTable.vue'

export default {
  name: 'CreateView',
  components: {
    Creation,
    CategoryTable,
    ExampleTable,
    MeaningTable,
    WordTable,
    CreationLong
  },
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
