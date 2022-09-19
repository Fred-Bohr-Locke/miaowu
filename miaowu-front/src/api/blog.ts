import request from "@/utils/request"

export const getList = (page, size) => {
  return request({
    url: "/blog/search",
    method: "post",
    contentType: "application/json",
    data: {
      page: page,
      size: size
    }
  })
}
