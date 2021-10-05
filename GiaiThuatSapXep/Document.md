1. Bubble Sort : Sắp xếp nổi bọt
> Nguyên lí :
    ~ Chạy từ đầu đến cuối mảng
    ~ Nếu phần tử đứng trước mà lơn hơn phần tử đứng sau thi đổi chỗ
    ~ Sau mỗi vòng lặp thì phần tử nhỏ nhất trôi lên trên
> Nhược điểm : dừng lại khi sắp xếp thành công
2. Insertion Sort : Sắp xếp chèn
>Nguyên lí: 
    ~ Chạy từ đầu đến cuối mảng
    ~ Tại vòng lặp i, coi như dãy từ [0,i-1] đã được sắp xếp
    , chèn phần tử a[i] vào vị trí thích hợp
    ~ Sau vòng lặp thứ i thì dãy [0,i] được được sắp xếp
3.Selection Sort : Sắp xếp chọn
>Nguyên lí :
    ~ chạy từ đầu đến cuối mảng
    ~ Tại vòng lặp thứ i, tìm phần tử nhỏ nhất từ [i+1,n-1]
    nếu nhỏ hơn a[i] thì đổi chô cho a[i]
    ~ Sau vòng lặp thứ i thì dãy [0,i] đã được sắp xếp