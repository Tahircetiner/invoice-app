const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  devServer: {
    headers: { "Access-Control-Allow": "*","Access-Control-Allow-Headers": "Content-Type" }
  }

})
